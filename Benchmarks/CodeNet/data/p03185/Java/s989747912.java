import java.io.*;
import java.util.*;

class RemoveCondition implements Comparable<RemoveCondition> {
  final long h;
  final int index;

  RemoveCondition(long h, int index) {
    this.h = h;
    this.index = index;
  }

  public int compareTo(RemoveCondition removeCondition) {
    return Long.compare(this.h, removeCondition.h);
  }
}

class Solver {
  final int n;
  final long c;
  final long[] hs;

  long[] costs;

  Solver(int n, long c, long[] hs) {
    this.n = n;
    this.c = c;
    this.hs = hs;
  }

  // (h - hs[i-1])*(h - hs[i-1]) + c + costs[i-1] < (h - hs[i]) * (h - hs[i]) + c + costs[i]
  // h*h - 2 * hs[i-1] * h + hs[i-1]*hs[i-1] + c + costs[i-1] < h*h - 2 * hs[i] * h + hs[i]*hs[i] + c + costs[i]
  // - 2 * hs[i-1] * h + hs[i-1]*hs[i-1] + costs[i-1] < - 2 * hs[i] * h + hs[i]*hs[i] + costs[i]
  // 2 * hs[i] * h - 2 * hs[i-1] * h < hs[i]*hs[i] - hs[i-1]*hs[i-1] + costs[i] - costs[i-1]
  // 2(hs[i] - hs[i-1]) * h < hs[i]*hs[i] - hs[i-1]*hs[i-1] + costs[i] - costs[i-1]
  // h < (hs[i]*hs[i] - hs[i-1]*hs[i-1] + costs[i] - costs[i-1]) / {2(hs[i] - hs[i-1])}
  private long calculateRemoveConditionH(int lowerIndex, int higherIndex) {
    long hHigher = hs[higherIndex];
    long hLower = hs[lowerIndex];
    long a = hHigher * hHigher - hLower * hLower + costs[higherIndex] - costs[lowerIndex];
    long b = 2 * (hHigher - hLower);
    return (a + b - 1) / b;
  }

  public long solve() {
    costs = new long[n];
    TreeSet<Integer> aliveIndexSet = new TreeSet<>();
    PriorityQueue<RemoveCondition> removeConditionQueue = new PriorityQueue<>();

    costs[0] = 0;
    aliveIndexSet.add(0);
    for (int i = 1; i < n; i++) {
      long h = hs[i];
      while (!removeConditionQueue.isEmpty() && removeConditionQueue.peek().h <= h) {
        int removedIndex = removeConditionQueue.poll().index;
        if (!aliveIndexSet.remove(removedIndex)) {
          continue;
        }
        Integer lowerIndex = aliveIndexSet.lower(removedIndex);
        if (lowerIndex == null) {
          continue;
        }
        Integer higherIndex = aliveIndexSet.higher(lowerIndex);
        if (higherIndex == null) {
          continue;
        }
        removeConditionQueue.add(new RemoveCondition(calculateRemoveConditionH(lowerIndex, higherIndex), lowerIndex));
      }
      {
        int aliveSmallestIndex = aliveIndexSet.first();
        long diff = hs[i] - hs[aliveSmallestIndex];
        costs[i] = diff * diff + c + costs[aliveSmallestIndex];
        aliveIndexSet.add(i);
        Integer lowerIndex = aliveIndexSet.lower(i);
        removeConditionQueue.add(new RemoveCondition(calculateRemoveConditionH(lowerIndex, i), lowerIndex));  
      }
    }
    return costs[n - 1];
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    long c = reader.nextLong();
    long[] hs = reader.nextLong(n);
    out.println(new Solver(n, c, hs).solve());
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
