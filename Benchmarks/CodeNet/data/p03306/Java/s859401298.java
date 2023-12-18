import java.io.*;
import java.util.*;

class Edge {
  final int id, nextIndex;
  final long s;
  
  Edge(int id, int nextIndex, long s) {
    this.id = id;
    this.nextIndex = nextIndex;
    this.s = s;
  }
}

class Node {
  final long constant;
  final boolean positive;
  
  Node(long constant, boolean positive) {
    this.constant = constant;
    this.positive = positive;
  }
  
  Node calculateNext(long s) {
    return new Node(s - constant, !positive);
  }
}

class Solver {
  final int n, m;
  final int[] us, vs;
  final long[] ss;
  
  List<List<Edge>> graph;
  boolean[] used;
  Node[] nodes;
  
  long[] simpleValues;
  
  Solver(int n, int m, int[] us, int[] vs, long[] ss) {
    this.n = n;
    this.m = m;
    this.us = us;
    this.vs = vs;
    this.ss = ss;
  }
  
  enum GraphType {
    VALID_NO_ODD_CYCLE,
    VALID_ODD_CYCLE,
    INVALID
  }
  
  private boolean dfsSimple(int index) {
    for (Edge edge : graph.get(index)) {
      int nextIndex = edge.nextIndex;
      if (simpleValues[nextIndex] > 0) {
        continue;
      }
      long nextValue = edge.s - simpleValues[index];
      if (nextValue <= 0) {
        return false;
      }
      simpleValues[nextIndex] = nextValue;
      if (!dfsSimple(nextIndex)) {
        return false;
      }
    }
    return true;
  }
  
  private GraphType dfs(int index) {
    for (Edge edge : graph.get(index)) {
      if (used[edge.id]) {
        continue;
      }
      used[edge.id] = true;
      Node next = nodes[index].calculateNext(edge.s);
      if (nodes[edge.nextIndex] == null) {
        nodes[edge.nextIndex] = next;
        GraphType nextGraphType = dfs(edge.nextIndex);
        if (nextGraphType != GraphType.VALID_NO_ODD_CYCLE) {
          return nextGraphType;
        }
      } else if (nodes[edge.nextIndex].positive == next.positive) {
        if (nodes[edge.nextIndex].constant != next.constant) {
          return GraphType.INVALID;
        }
      } else {
        // node.constant + x = next.constant - x
        // 2x = next.constant - node.constant
        long constantDiff = next.constant - nodes[edge.nextIndex].constant;
        if (constantDiff == 0 || constantDiff % 2 != 0) {
          return GraphType.INVALID;
        }
        
        simpleValues = new long[n + 1];
        simpleValues[1] = Math.abs(constantDiff / 2);
        if (dfsSimple(1)) {
          return GraphType.VALID_ODD_CYCLE;
        } else {
          return GraphType.INVALID;
        }
      }
    }
    return GraphType.VALID_NO_ODD_CYCLE;
  }
  
  public long solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int i = 0; i < m; i++) {
      graph.get(us[i]).add(new Edge(i, vs[i], ss[i]));
      graph.get(vs[i]).add(new Edge(i, us[i], ss[i]));
    }
    
    used = new boolean[m];
    nodes = new Node[n + 1];
    nodes[1] = new Node(0, true);
    switch (dfs(1)) {
      case INVALID:
        return 0L;
      case VALID_ODD_CYCLE:
        return 1L;
    }
    
    long minPositiveConstant = Long.MAX_VALUE;
    long minNegativeConstant = Long.MAX_VALUE;
    for (int i = 1; i <= n; i++) {
      if (nodes[i].positive) {
        minPositiveConstant = Math.min(minPositiveConstant, nodes[i].constant);
      } else {
        minNegativeConstant = Math.min(minNegativeConstant, nodes[i].constant);
      }
    }
    
    return Math.max(0, minPositiveConstant + minNegativeConstant - 1);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[] us = new int[m];
    int[] vs = new int[m];
    long[] ss = new long[m];
    for (int i = 0; i < m; i++) {
      us[i] = reader.nextInt();
      vs[i] = reader.nextInt();
      ss[i] = reader.nextLong();
    }
    out.println(new Solver(n, m, us, vs, ss).solve());
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
  
  public long getF(int n) {
    resize(n);
    return factorialCache.get(n);
  }
  
  public long getP(int n, int r) {
    resize(n);
    return modCalculator.mul(factorialCache.get(n), factorialInverseCache.get(n - r));
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
