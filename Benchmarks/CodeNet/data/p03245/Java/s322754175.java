import java.io.*;
import java.util.*;

class Result {
  final List<Long> ds;
  final List<List<Character>> ws;

  Result(List<Long> ds, List<List<Character>> ws) {
    this.ds = ds;
    this.ws = ws;
  }
}

class SubSolver {
  final int n;
  final long[] xs, ys;

  SubSolver(int n, long[] xs, long[] ys) {
    this.n = n;
    this.xs = xs;
    this.ys = ys;
  }

  Result solve() {
    long[] us = new long[n];
    long[] vs = new long[n];
    for (int i = 0; i < n; i++) {
      us[i] = xs[i] + ys[i];
      vs[i] = xs[i] - ys[i];
    }
    List<Long> ds = new ArrayList<>();
    for (int i = 0; i <= 30; i++) {
      ds.add(1L << i);
    }
    List<List<Character>> ws = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      long u = (us[i] + (1L << 31) - 1) / 2;
      long v = (vs[i] + (1L << 31) - 1) / 2;
      List<Character> cs = new ArrayList<>();
      for (int j = 0; j <= 30; j++) {
        boolean hasU = ((u >> j) & 1) == 1;
        boolean hasV = ((v >> j) & 1) == 1;
        if (hasU && hasV) {
          cs.add('R');
        } else if (hasU) {
          cs.add('U');
        } else if (hasV) {
          cs.add('D');
        } else {
          cs.add('L');
        }
      }
      ws.add(cs);
    }

    // u = x + y
    // v = x - y
    return new Result(ds, ws);
  }
}

class Solver {
  final int n;
  final long[][] xys;

  Solver(int n, long[][] xys) {
    this.n = n;
    this.xys = xys;
  }

  private static long calculateParity(long[] xy) {
    return Math.abs(xy[0] + xy[1]) % 2;
  }

  public List<String> solve() {
    long parity = calculateParity(xys[0]);
    for (long[] xy : xys) {
      if (calculateParity(xy) != parity) {
        return Arrays.asList("-1");
      }
    }
    long[] xs = new long[n];
    long[] ys = new long[n];
    for (int i = 0; i < n; i++) {
      xs[i] = xys[i][0] - parity + 1;
      ys[i] = xys[i][1];
    }
    Result result = new SubSolver(n, xs, ys).solve();
    if (parity == 0) {
      result.ds.add(1L);
      for (List<Character> list : result.ws) {
        list.add('L');
      }
    }
    List<String> answers = new ArrayList<>();
    answers.add("" + result.ds.size());
    StringBuilder sb = new StringBuilder();
    sb.append(result.ds.get(0));
    for (int i = 1; i < result.ds.size(); i++) {
      sb.append(" ");
      sb.append(result.ds.get(i));
    }
    answers.add(sb.toString());
    for (List<Character> list : result.ws) {
      sb = new StringBuilder();
      for (Character c : list) {
        sb.append(c);
      }
      answers.add(sb.toString());
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    long[][] xys = reader.nextLong(n, 2);
    out.printList(new Solver(n, xys).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestWriter extends PrintWriter {
  ContestWriter(PrintStream printeStream) {
    super(printeStream);
  }

  public void printList(List<? extends Object> list) {
    for (Object object : list) {
      println(object);
    }
  }

  public void printListOneLine(List<? extends Object> list) {
    List<String> stringList = new ArrayList<>();
    for (Object object : list) {
      stringList.add(object.toString());
    }
    println(String.join(" ", stringList));
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
  
  public String nextLine() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b) && b != 0x20) {
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
  
  public String[] nextLine(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLine();
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
  
  public String[][] next(int n, int m) {
    String[][] matrix = new String[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = next();
      }
    }
    return matrix;
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
