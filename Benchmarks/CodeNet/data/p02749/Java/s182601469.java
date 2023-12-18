import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final int[][] abs;

  List<List<Integer>> graph;
  List<Integer> mod1_3, mod2_3, mod0_6, mod3_6;

  Solver(int n, int[][] abs) {
    this.n = n;
    this.abs = abs;
  }

  private void dfs(int index, int parentIndex, int depth) {
    if (depth % 3 == 1) {
      mod1_3.add(index);
    } else if (depth % 3 == 2) {
      mod2_3.add(index);
    } else if (depth % 6 == 0) {
      mod0_6.add(index);
    } else {
      mod3_6.add(index);
    }
    for (int next : graph.get(index)) {
      if (next == parentIndex) {
        continue;
      }
      dfs(next, index, depth + 1);
    }
  }

  private List<Integer> assign(List<Integer> mod1group, List<Integer> mod2group, List<Integer> mod0group, List<Integer> rest) {
    int[] answers = new int[n + 1];
    int mod1v = 0;
    for (int v : mod1group) {
      answers[v] = 3 * mod1v + 1;
      mod1v++;
    }
    int mod2v = 0;
    for (int v : mod2group) {
      answers[v] = 3 * mod2v + 2;
      mod2v++;
    }
    int mod0v = 1;
    for (int v : mod0group) {
      answers[v] = 3 * mod0v;
      mod0v++;
    }
    for (int v : rest) {
      if (3 * mod1v + 1 <= n) {
        answers[v] = 3 * mod1v + 1;
        mod1v++;
      } else if (3 * mod2v + 2 <= n) {
        answers[v] = 3 * mod2v + 2;
        mod2v++;
      } else {
        answers[v] = 3 * mod0v;
        mod0v++;
      }
    }
    List<Integer> answerList = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      answerList.add(answers[i]);
    }
    return answerList;
  }

  private List<Integer> solveFromRoot(int root) {
    mod1_3 = new ArrayList<>();
    mod2_3 = new ArrayList<>();
    mod0_6 = new ArrayList<>();
    mod3_6 = new ArrayList<>();
    dfs(root, 0, 0);
    int countMod1 = n / 3 + (n % 3 >= 1 ? 1 : 0);
    int countMod2 = n / 3 + (n % 3 >= 2 ? 1 : 0);
    int[] answers = new int[n + 1];
    if (mod1_3.size() <= countMod1 &&
        mod2_3.size() <= countMod2 &&
        mod0_6.size() <= n / 3) {
      return assign(mod1_3, mod2_3, mod0_6, mod3_6);
    }
    if (mod1_3.size() <= countMod1 &&
        mod2_3.size() <= countMod2 &&
        mod3_6.size() <= n / 3) {
      return assign(mod1_3, mod2_3, mod3_6, mod0_6);
    }
    if (mod1_3.size() <= countMod2 &&
        mod2_3.size() <= countMod1 &&
        mod0_6.size() <= n / 3) {
      return assign(mod2_3, mod1_3, mod0_6, mod3_6);
    }
    if (mod1_3.size() <= countMod2 &&
        mod2_3.size() <= countMod1 &&
        mod3_6.size() <= n / 3) {
      return assign(mod2_3, mod1_3, mod3_6, mod0_6);
    }
    return null;
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
    List<Integer> candidate;
    candidate = solveFromRoot(1);
    if (candidate != null) {
      return candidate;
    }
    candidate = solveFromRoot(graph.get(1).get(0));
    if (candidate != null) {
      return candidate;
    }
    for (int next : graph.get(1)) {
      for (int nextnext : graph.get(next)) {
        if (nextnext == 1) {
          continue;
        }
        candidate = solveFromRoot(nextnext);
        if (candidate == null) {
          return Arrays.asList(-1);
        } else {
          return candidate;
        }
      }
    }
    return Arrays.asList(-1);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[][] abs = reader.nextInt(n - 1, 2);
    List<Integer> answers = new Solver(n, abs).solve();
    out.print(answers.get(0));
    for (int i = 1; i < answers.size(); i++) {
      out.print(" ");
      out.print(answers.get(i));
    }
    out.println();
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestReader {
  private static final int BUFFER_SIZE = 1024;
  
  private final InputStream stream;
  private final byte[] buffer;
  private int pointer;
  private int bufferLength;
  
  ContestReader(InputStream stream) {
    this.stream = stream;
    this.buffer = new byte[BUFFER_SIZE];
    this.pointer = 0;
    this.bufferLength = 0;
  }
  
  private boolean hasNextByte() {
    if (pointer < bufferLength) {
      return true;
    }
    
    pointer = 0;
    try {
      bufferLength = stream.read(buffer);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return bufferLength > 0;
  }
  
  private int readByte() {
    if (hasNextByte()) {
      return buffer[pointer++];
    } else {
      return -1;
    }
  }
  
  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }
  
  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[pointer])) {
      pointer++;
    }
    return hasNextByte();
  }
  
  public String next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b)) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public char nextChar() {
    return next().charAt(0);
  }
  
  public int nextInt() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    int n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
  }
  
  public long nextLong() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    long n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
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
  
  public char[] nextChar(int n) {
    char[] array = new char[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextChar();
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
  
  public char[][] nextChar(int n, int m) {
    char[][] matrix = new char[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextChar();
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
