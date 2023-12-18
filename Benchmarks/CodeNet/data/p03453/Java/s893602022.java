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

class Solver {
  final int n, m, s, t;
  final int[] us, vs;
  final long[] ds;
  ModCalculator mc;
  List<List<NextNode>> graph;
  
  Solver(int n, int m, int s, int t, int[] us, int[] vs, long[] ds) {
    this.n = n;
    this.m = m;
    this.s = s;
    this.t = t;
    this.us = us;
    this.vs = vs;
    this.ds = ds;
    this.mc = new ModCalculator(1_000_000_007L);
  }
  
  private void dijkstra(int src, long[] costs, long[] counts) {
    Arrays.fill(costs, -1);
    Arrays.fill(counts, 0);
    counts[src] = 1;
    
    PriorityQueue<NextNode> queue = new PriorityQueue<>();
    queue.add(new NextNode(src, 0));
    while (!queue.isEmpty()) {
      NextNode n1 = queue.poll();
      if (costs[n1.index] >= 0) {
        continue;
      }
      costs[n1.index] = n1.cost;
      for (NextNode n2 : graph.get(n1.index)) {
        if (costs[n2.index] >= 0) {
          if (costs[n2.index] + n2.cost == costs[n1.index]) {
            counts[n1.index] = mc.add(counts[n1.index], counts[n2.index]);
          }
        } else {
          queue.add(new NextNode(n2.index, n1.cost + n2.cost));
        }
      }
    }
  }
  
  public long solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int i = 0; i < m; i++) {
      graph.get(us[i]).add(new NextNode(vs[i], ds[i]));
      graph.get(vs[i]).add(new NextNode(us[i], ds[i]));
    }
    long[] costsFromS = new long[n + 1];
    long[] costsFromT = new long[n + 1];
    long[] countsFromS = new long[n + 1];
    long[] countsFromT = new long[n + 1];
    
    dijkstra(s, costsFromS, countsFromS);
    /*
    for (int i = 1; i <= n; i++) {
      System.err.printf("%d %d %d\n", i, costsFromS[i], countsFromS[i]);
    }
    */
    dijkstra(t, costsFromT, countsFromT);
    /*
    for (int i = 1; i <= n; i++) {
      System.err.printf("%d %d %d\n", i, costsFromT[i], countsFromT[i]);
    }
    */
    
    long minCost = costsFromS[t];
    long collisionCount = 0;
    for (int i = 1; i <= n; i++) {
      if (costsFromS[i] == costsFromT[i] && costsFromS[i] + costsFromT[i] == minCost) {
        long count = mc.pow(mc.mul(countsFromS[i], countsFromT[i]), 2);
        collisionCount = mc.add(collisionCount, count);
      }
    }
//    System.err.println(collisionCount);
    for (int i = 0; i < m; i++) {
      int u = us[i];
      int v = vs[i];
      long d = ds[i];
      if (costsFromS[u] + d + costsFromT[v] == minCost && costsFromS[u] + d > minCost / 2 && costsFromT[v] + d > minCost / 2) {
        collisionCount = mc.add(collisionCount, mc.pow(mc.mul(countsFromS[u], countsFromT[v]), 2));
      } else if (costsFromS[v] + d + costsFromT[u] == minCost && costsFromS[v] + d > minCost / 2 && costsFromT[u] + d > minCost / 2) {
        collisionCount = mc.add(collisionCount, mc.pow(mc.mul(countsFromS[v], countsFromT[u]), 2));
      }
    }
//    System.err.printf("%d %d %d\n", countsFromS[t], countsFromT[s], collisionCount);
    return mc.sub(mc.mul(countsFromS[t], countsFromT[s]), collisionCount);
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
    long[] ds = new long[m];
    for (int i = 0; i < m; i++) {
      us[i] = reader.nextInt();
      vs[i] = reader.nextInt();
      ds[i] = reader.nextLong();
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
