import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
  final int length, cost;
  
  Node(int length, int cost) {
    this.cost = cost;
    this.length = length;
  }
  
  public int compareTo(Node node) {
    return this.cost - node.cost;
  }
}

class Solver {
  final char[] cs;
  
  Solver(char[] cs) {
    this.cs = cs;
  }
  
  public int solve() {
    int[] bitsets = new int[cs.length + 1];
    Map<Integer, TreeSet<Integer>> bitsetToTreeSet = new HashMap<>();
    for (int i = 0; i < cs.length; i++) {
      bitsets[i + 1] = bitsets[i] ^ (1 << (cs[i] - 'a'));
      if (bitsetToTreeSet.get(bitsets[i + 1]) == null) {
        bitsetToTreeSet.put(bitsets[i + 1], new TreeSet<>());
      }
      bitsetToTreeSet.get(bitsets[i + 1]).add(i + 1);
    }
    if (bitsets[cs.length] == 0) {
      return 1;
    }
    
    boolean[] enqueued = new boolean[cs.length + 1];
    PriorityQueue<Node> queue = new PriorityQueue<>();
    queue.add(new Node(0, 0));
    enqueued[0] = true;
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      if (node.length == cs.length) {
        return node.cost;
      }
      for (int i = 0; i < 26; i++) {
        int nextBitset = bitsets[node.length] ^ (1 << i);
        TreeSet<Integer> treeSet = bitsetToTreeSet.get(nextBitset);
        if (treeSet == null) {
          continue;
        }
        Integer nextLength = node.length;
        while (true) {
          nextLength = treeSet.higher(nextLength);
          if (nextLength == null || enqueued[nextLength]) {
            break;
          }
          queue.add(new Node(nextLength, node.cost + 1));
          enqueued[nextLength] = true;
        }
      }
    }
    throw new RuntimeException();
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    char[] cs = reader.nextCharArray();
    out.println(new Solver(cs).solve());
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
