import java.io.*;
import java.util.*;

class Query implements Comparable<Query> {
  final int a, b, cost, enqueueWithoutContribution;
  
  Query(int a, int b, int cost, int enqueueWithoutContribution) {
    this.a = a;
    this.b = b;
    this.cost = cost;
    this.enqueueWithoutContribution = enqueueWithoutContribution;
  }
  
  public int compareTo(Query query) {
    if (this.cost != query.cost) {
      return this.cost - query.cost;
    }
    return this.enqueueWithoutContribution - query.enqueueWithoutContribution;
  }
}

class Solver {
  final int n, q;
  final int[][] abcs;
  
  Solver(int n, int q, int[][] abcs) {
    this.n = n;
    this.q = q;
    this.abcs = abcs;
  }
  
  public Query calculateNextQuery(Query query, boolean contributed) {
    return new Query(query.b, (query.a + 1)% n, query.cost + 1, contributed ? 0 : query.enqueueWithoutContribution + 1);
  }
  
  public long solve() {
    PriorityQueue<Query> queue = new PriorityQueue<>();
    for (int[] abc : abcs) {
      int a = abc[0];
      int b = abc[1];
      int c = abc[2];
      queue.add(new Query(a, b, c, 0));
    }
    
    int count = 0;
    long cost = 0;
    UnionFind unionFind = new UnionFind(n);
    while (count < n - 1) {
      Query query = queue.poll();
      
      boolean contribution = false;
      if (!unionFind.sameGroup(query.a, query.b)) {
        count++;
        cost += query.cost;
        unionFind.merge(query.a, query.b);
        contribution = true;
      }
      
      Query nextQuery = calculateNextQuery(query, contribution);
      if (nextQuery.enqueueWithoutContribution >= 4) {
        continue;
      }
      queue.add(nextQuery);
    }
    
    return cost;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int q = reader.nextInt();
    int[][] abcs = reader.nextInt(q, 3);
    out.println(new Solver(n, q, abcs).solve());
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
  
  public String[] next(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextInt(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLong(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDouble(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public char[] nextCharArray() {
    return next().toCharArray();
  }
  
  public int[][] nextInt(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLong(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDouble(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
  
  public char[][] nextCharArray(int n) {
    char[][] matrix = new char[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = next().toCharArray();
    }
    return matrix;
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
