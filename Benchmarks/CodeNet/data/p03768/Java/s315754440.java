import java.io.*;
import java.util.*;

class PaintInfo implements Comparable<PaintInfo> {
  final int i, v, c;
  
  PaintInfo(int i, int v, int c) {
    this.i = i;
    this.v = v;
    this.c = c;
  }
  
  public int compareTo(PaintInfo paintInfo) {
    return paintInfo.i - this.i;
  }
}

class Solver {
  final int n, m, q;
  final int[][] abs, vdcs;
  List<List<Integer>> graph;
  
  Solver(int n, int m, int[][] abs, int q, int[][] vdcs) {
    this.n = n;
    this.m = m;
    this.abs = abs;
    this.q = q;
    this.vdcs = vdcs;
  }
  
  public List<Integer> solve() {
    graph = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] ab : abs) {
      int a = ab[0];
      int b = ab[1];
      graph.get(a).add(b);
      graph.get(b).add(a);
    }
    
    PriorityQueue<PaintInfo> queue = new PriorityQueue<>();
    int[] painted = null;
    for (int depth = 10; depth >= 0; depth--) {
      PriorityQueue<PaintInfo> nextQueue = new PriorityQueue<>();
      for (int i = 0; i < q; i++) {
        int v = vdcs[i][0];
        int d = vdcs[i][1];
        int c = vdcs[i][2];
        if (d != depth) {
          continue;
        }
        queue.add(new PaintInfo(i, v, c));
      }
      
      painted = new int[n + 1];
      while (!queue.isEmpty()) {
        PaintInfo paintInfo = queue.poll();
        int i = paintInfo.i;
        int v = paintInfo.v;
        int c = paintInfo.c;
        if (painted[v] == 0) {
          nextQueue.add(paintInfo);
          painted[v] = c;
        }
        if (depth > 0) {
          for (int nextV : graph.get(paintInfo.v)) {
            if (painted[nextV] == 0) {
              nextQueue.add(new PaintInfo(i, nextV, c));
              painted[nextV] = c;
            }
          }
        }
      }
      
      queue = nextQueue;
    }
    
    List<Integer> output = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      output.add(painted[i]);
    }
    return output;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[][] abs = reader.nextInt(m, 2);
    int q = reader.nextInt();
    int[][] vdcs = reader.nextInt(q, 3);
    for (int c : new Solver(n, m, abs, q, vdcs).solve()) {
      out.println(c);
    }
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
