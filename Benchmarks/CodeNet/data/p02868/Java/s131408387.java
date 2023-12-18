import java.io.*;
import java.util.*;

class Edge implements Comparable<Edge> {
  final int rightMost, cost;
  
  Edge(int rightMost, int cost) {
    this.rightMost = rightMost;
    this.cost = cost;
  }
  
  public int compareTo(Edge edge) {
    return this.cost - edge.cost;
  }
}

class Solver {
  final int n, m;
  final int[][] lrcs;
  List<List<Edge>> graph;
  
  Solver(int n, int m, int[][] lrcs) {
    this.n = n;
    this.m = m;
    this.lrcs = lrcs;
  }
  
  public long solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] lrc: lrcs) {
      int l = lrc[0];
      int r = lrc[1];
      int c = lrc[2];
      graph.get(l).add(new Edge(r, c));
    }
    TreeMap<Integer, Long> treeMap = new TreeMap<>();
    treeMap.put(1, 0L);
    for (int i = 1; i <= n; i++) {
      Map.Entry<Integer, Long> ceilingEntry = treeMap.ceilingEntry(i);
      if (ceilingEntry == null) {
        return -1;
      }
      /*
      System.err.println("---------------------");
      System.err.printf("%d %d\n", i, ceilingEntry.getValue());
      for (Map.Entry<Integer, Long> entry : treeMap.entrySet()) {
        System.err.printf("%d %d\n", entry.getKey(), entry.getValue());
      }
      */
      Collections.sort(graph.get(i));
      long cost = ceilingEntry.getValue();
      for (Edge edge : graph.get(i)) {
        int rightMost = edge.rightMost;
        long nextCost = cost + edge.cost;
        Map.Entry<Integer, Long> existCeilingEntry = treeMap.ceilingEntry(rightMost);
        if (existCeilingEntry != null && existCeilingEntry.getValue() <= nextCost) {
          continue;
        }
        treeMap.put(rightMost, nextCost);
        while (true) {
          Map.Entry<Integer, Long> removeCandidateEntry = treeMap.lowerEntry(rightMost);
          if (removeCandidateEntry == null || removeCandidateEntry.getValue() < nextCost) {
            break;
          }
          treeMap.remove(removeCandidateEntry.getKey());
        }
      }
    }
    {
      Map.Entry<Integer, Long> ceilingEntry = treeMap.ceilingEntry(n);
      if (ceilingEntry == null) {
        return -1;
      }
      return ceilingEntry.getValue();
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[][] lrcs = reader.nextIntMatrix(m, 3);
    out.println(new Solver(n, m, lrcs).solve());
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
