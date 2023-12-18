import java.io.*;
import java.util.*;

class NextNode implements Comparable<NextNode> {
  final int index;
  final long cost;
  
  NextNode(int index, long cost) {
    this.index = index;
    this.cost = cost;
  }
  
  public int compareTo(NextNode nextNode) {
    return Long.compare(this.cost, nextNode.cost);
  }
}

class NodeOrEdgePoint {
  final int nodeIndex;
  final int edgeNodeMinIndex;
  final int edgeNodeMaxIndex;
  final long distanceFromMinIndex;
  
  NodeOrEdgePoint(int nodeIndex, int edgeNodeMinIndex, int edgeNodeMaxIndex, long distanceFromMinIndex) {
    this.nodeIndex = nodeIndex;
    this.edgeNodeMinIndex = edgeNodeMinIndex;
    this.edgeNodeMaxIndex = edgeNodeMaxIndex;
    this.distanceFromMinIndex = distanceFromMinIndex;
  }
  
  public boolean equals(Object object) {
    NodeOrEdgePoint that = (NodeOrEdgePoint) object;
    return this.nodeIndex == that.nodeIndex &&
        this.edgeNodeMinIndex == that.edgeNodeMinIndex &&
        this.edgeNodeMaxIndex == that.edgeNodeMaxIndex &&
        this.distanceFromMinIndex == that.distanceFromMinIndex;
  }
  
  public int hashCode() {
    int hashCode = nodeIndex;
    hashCode *= 13;
    hashCode += edgeNodeMinIndex;
    hashCode *= 13;
    hashCode += edgeNodeMaxIndex;
    hashCode *= 13;
    hashCode += Long.hashCode(distanceFromMinIndex);
    return hashCode;
  }
  
  public static NodeOrEdgePoint createNodeInstance(int nodeIndex) {
    return new NodeOrEdgePoint(nodeIndex, 0, 0, 0);
  }
  
  public static NodeOrEdgePoint createEdgeInstance(int src, int dst, long distanceFromSrc, long length) {
    if (src < dst) {
      return new NodeOrEdgePoint(0, src, dst, distanceFromSrc);
    } else {
      return new NodeOrEdgePoint(0, dst, src, length - distanceFromSrc);
    }
  }
}

class Solver {
  final int n, m, s, t;
  final int[] us, vs, ds;
  ModCalculator mc;
  List<List<NextNode>> graph;
  
  Solver(int n, int m, int s, int t, int[] us, int[] vs, int[] ds) {
    this.n = n;
    this.m = m;
    this.s = s;
    this.t = t;
    this.us = us;
    this.vs = vs;
    this.ds = ds;
    this.mc = new ModCalculator(1_000_000_007L);
  }
  
  private long simpleDijkstra() {
    boolean[] visited = new boolean[n + 1];
    PriorityQueue<NextNode> queue = new PriorityQueue<>();
    queue.add(new NextNode(s, 0));
    while (true) {
      NextNode n1 = queue.poll();
      if (visited[n1.index]) {
        continue;
      }
      if (n1.index == t) {
        return n1.cost;
      }
      visited[n1.index] = true;
      for (NextNode n2 : graph.get(n1.index)) {
        if (visited[n2.index]) {
          continue;
        }
        queue.add(new NextNode(n2.index, n1.cost + n2.cost));
      }
    }
  }
  
  private Map<NodeOrEdgePoint, Long> dijkstra(int src, long halfCost) {
    long[] cost = new long[n + 1];
    Arrays.fill(cost, -1);
    long[] count = new long[n + 1];
    count[src] = 1;
    PriorityQueue<NextNode> queue = new PriorityQueue<>();
    queue.add(new NextNode(src, 0));
    Map<NodeOrEdgePoint, Long> results = new HashMap<>();
    while (!queue.isEmpty()) {
      NextNode n1 = queue.poll();
      if (cost[n1.index] >= 0) {
        continue;
      }
      cost[n1.index] = n1.cost;
      for (NextNode n2 : graph.get(n1.index)) {
        if (cost[n2.index] >= 0 && cost[n2.index] + n2.cost == cost[n1.index]) {
          count[n1.index] = mc.add(count[n1.index], count[n2.index]);
        }
      }
      if (n1.cost == halfCost) {
        results.put(NodeOrEdgePoint.createNodeInstance(n1.index), count[n1.index]);
        continue;
      }
      for (NextNode n2 : graph.get(n1.index)) {
        if (cost[n2.index] < 0) {
          if (n1.cost + n2.cost <= halfCost) {
            queue.add(new NextNode(n2.index, n1.cost + n2.cost));
          } else {
            results.put(NodeOrEdgePoint.createEdgeInstance(n1.index, n2.index, n1.cost + n2.cost - halfCost, n2.cost), count[n1.index]);
          }
        }
      }
    }
    return results;
  }
  
  public long solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int i = 0; i < m; i++) {
      graph.get(us[i]).add(new NextNode(vs[i], 2 * ds[i]));
      graph.get(vs[i]).add(new NextNode(us[i], 2 * ds[i]));
    }
    long totalLength = simpleDijkstra();
    long halfLength = totalLength / 2;
    
    Map<NodeOrEdgePoint, Long> mapFromS = dijkstra(s, halfLength);
    Map<NodeOrEdgePoint, Long> mapFromT = dijkstra(t, halfLength);
    long sumFromS = 0;
    long sumFromT = 0;
    long collisionCount = 0;
    for (Map.Entry<NodeOrEdgePoint, Long> mapFromSEntry : mapFromS.entrySet()) {
      NodeOrEdgePoint key = mapFromSEntry.getKey();
      long countFromS = mapFromSEntry.getValue();
      Long countFromT = mapFromT.get(key);
      if (countFromT == null) {
        continue;
      }
      sumFromS = mc.add(sumFromS, countFromS);
      sumFromT = mc.add(sumFromT, countFromT);
      collisionCount = mc.add(collisionCount, mc.mul(countFromS, countFromT));
    }
    return mc.sub(mc.mul(sumFromS, sumFromT), collisionCount);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int s = reader.nextInt();
    int t = reader.nextInt();
    int[] us = new int[m];
    int[] vs = new int[m];
    int[] ds = new int[m];
    for (int i = 0; i < m; i++) {
      us[i] = reader.nextInt();
      vs[i] = reader.nextInt();
      ds[i] = reader.nextInt();
    }
    out.println(new Solver(n, m, s, t, us, vs, ds).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }
  
  public int nextInt() {
    return Integer.parseInt(next());
  }
  
  public long nextLong() {
    return Long.parseLong(next());
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
  
  public String[] nextArray(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDoubleArray(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public int[][] nextIntMatrix(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLongMatrix(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDoubleMatrix(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
}

class ModCalculator {
  private final long mod;
  
  ModCalculator(long mod) {
    this.mod = mod;
  }
  
  public long add(long a, long b) {
    return (a + b) % mod;
  }
  
  public long sub(long a, long b) {
    return (a - b + mod) % mod;
  }
  
  public long mul(long a, long b) {
    return (a * b) % mod;
  }
  
  public long pow(long a, long b) {
    if (b == 0) {
      return 1;
    }
    long v = pow(mul(a, a), b / 2);
    if (b % 2 == 1) {
      return mul(v, a);
    } else {
      return v;
    }
  }
  
  public long inverse(long a) {
    return pow(a, mod - 2);
  }
  
  public long div(long a, long b) {
    return mul(a, inverse(b));
  }
}
 
class ModCombinationCache {
  private final ModCalculator modCalculator;
  private final List<Long> factorialCache;
  private final List<Long> factorialInverseCache;
  
  public ModCombinationCache(ModCalculator modCalculator) {
    this.modCalculator = modCalculator;
    factorialCache = new ArrayList<>();
    factorialCache.add(1L);
    factorialInverseCache = new ArrayList<>();
    factorialInverseCache.add(1L);
  }
  
  private void resize(int n) {
    for (int i = factorialCache.size() - 1; i < n; i++) {
      long v = modCalculator.mul(factorialCache.get(i), i + 1);
      factorialCache.add(v);
      factorialInverseCache.add(modCalculator.inverse(v));
    }
  }
  
  public long getP(int n) {
    resize(n);
    return factorialCache.get(n);
  }
  
  public long getC(int n, int k) {
    resize(n);
    return modCalculator.mul(factorialCache.get(n), modCalculator.mul(factorialInverseCache.get(k), factorialInverseCache.get(n-k)));
  }
}

class Algorithm {
  private static void swap(Object[] list, int a, int b) {
    Object tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }
  
  public static <T extends Comparable<? super T>> boolean nextPermutation(T[] ts) {
    int rightMostAscendingOrderIndex = ts.length - 2;
    while (rightMostAscendingOrderIndex >= 0 &&
        ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]) >= 0) {
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
    while (ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]) >= 0) {
      rightMostGreatorIndex--;
    }
    
    swap(ts, rightMostAscendingOrderIndex, rightMostGreatorIndex);
    for (int i = 0; i < (ts.length - rightMostAscendingOrderIndex - 1) / 2; i++) {
      swap(ts, rightMostAscendingOrderIndex + 1 + i, ts.length - 1 - i);
    }
    return true;
  }
  
  public static void shuffle(int[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void shuffle(long[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      long temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void sort(int[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
  
  public static void sort(long[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
}

class UnionFind {
  int[] parents;
  int[] ranks;

  UnionFind(int n) {
    parents = new int[n];
    ranks = new int[n];

    for (int i = 0; i < n; i++) {
      parents[i] = i;
    }
  }

  public int getRoot(int index) {
    if (parents[index] == index) {
      return index;
    } else {
      parents[index] = getRoot(parents[index]);
      return parents[index];
    }
  }

  public boolean sameGroup(int a, int b) {
    return getRoot(a) == getRoot(b);
  }

  public void merge(int a, int b) {
    int rootA = getRoot(a);
    int rootB = getRoot(b);
    if (rootA == rootB) {
      return;
    }
    if (ranks[rootA] < ranks[rootB]) {
      parents[rootA] = rootB;
    } else if (ranks[rootB] < ranks[rootA]) {
      parents[rootB] = rootA;
    } else {
      parents[rootA] = rootB;
      ranks[rootB]++;
    }
  }
}
