import java.io.*;
import java.util.*;

class Solver {
  private static final String[] KEY = new String[]{"A", "B", "C"};
  final int n, initA, initB, initC;

  final String[] ss;
  int index;
  int[] values;
  Deque<String> history;

  Solver(int n, int initA, int initB, int initC, String[] ss) {
    this.n = n;
    this.initA = initA;
    this.initB = initB;
    this.initC = initC;
    this.ss = ss;
  }

  private boolean switchSearchMode() {
    int hasCount = 0;
    for (int v : values) {
      if (v > 0) {
        hasCount++;
      }
    }
    return hasCount >= 2;
  }

  public List<String> searchMode() {
    for (; index < n; index++) {
      int thisTurn = -1;
      for (int k = 0; k < 3; k++) {
        if (OPERATIONS[k].equals(ss[index])) {
          thisTurn = k;
          break;
        }
      }
      int nextTurn = -1;
      if (index + 1 >= n) {
        nextTurn = thisTurn;
      } else {
        for (int k = 0; k < 3; k++) {
          if (OPERATIONS[k].equals(ss[index])) {
            nextTurn = k;
            break;
          }
        }
      }

      int[] thisTurnPair = PAIR_INDEXES[thisTurn];
      int[] nextTurnPair = PAIR_INDEXES[nextTurn];
      if (values[thisTurnPair[0]] == 0 || values[thisTurnPair[1]] >= 2) {
        update(thisTurnPair[0], thisTurnPair[1]);
      } else if (values[thisTurnPair[1]] == 0 || values[thisTurnPair[0]] >= 2) {
        update(thisTurnPair[1], thisTurnPair[0]);
      } else if (values[thisTurnPair[1]] == 1 && values[thisTurnPair[0]] == 1) {
        if (thisTurn == nextTurn) {
          update(thisTurnPair[0], thisTurnPair[1]);
        } else {
          if (thisTurn == 0 && nextTurn == 1) {
            update(1, 0);
          } else if (thisTurn == 0 && nextTurn == 2) {
            update(0, 1);
          } else if (thisTurn == 1 && nextTurn == 2) {
            update(2, 1);
          } else if (thisTurn == 1 && nextTurn == 0) {
            update(1, 2);
          } else if (thisTurn == 2 && nextTurn == 0) {
            update(0, 2);
          } else if (thisTurn == 2 && nextTurn == 1) {
            update(2, 0);
          } else {
//            throw new RuntimeException();
        return Arrays.asList("No");
          }
          // 0: (0, 1), 1: (1, 2)
          // 0: (0, 1), 2: (2, 0)
          // 1: (1, 2), 2: (2, 0)
          // 1: (1, 2), 0: (0, 1)
          // 2: (2, 0), 0: (0, 1)
          // 2: (2, 0), 1: (1, 2)
        }
      } else {
        return Arrays.asList("No");
//        throw new RuntimeException();
      }
    }
    return constructAnswer();
  }

  private void update(int incrementIndex, int decrementIndex) {
    history.addLast(KEY[incrementIndex]);
    values[incrementIndex]++;
    values[decrementIndex]--;
    if (values[decrementIndex] < 0) {
//      throw new RuntimeException();
    }
  }

  private static int[][] PAIR_INDEXES = new int[][]{
    new int[]{0, 1}, 
    new int[]{1, 2}, 
    new int[]{2, 0} 
  };

  private static String[] OPERATIONS = new String[]{
    "AB",
    "BC",
    "AC",
  };

  private List<String> constructAnswer() {
    List<String> answers = new ArrayList<>();
    answers.add("Yes");
    answers.addAll(history);
    return answers;
  }

  public List<String> solve() {
    history = new ArrayDeque<>();
    values = new int[]{initA, initB, initC};
    index = 0;
    while (index < n) {
      if (switchSearchMode()) {
        return searchMode();
      }

      for (int k = 0; k < 3; k++) {
        if (OPERATIONS[k].equals(ss[index])) {
          int[] pairs = PAIR_INDEXES[k];
          if (values[pairs[0]] == 0 && values[pairs[1]] == 0) {
            return Arrays.asList("No");
          }
          if (values[pairs[0]] > 0) {
            update(pairs[1], pairs[0]);
          } else {
            update(pairs[0], pairs[1]);
          }
          break;
        }
      }
      index++;
    }
    return constructAnswer();
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    int a = reader.nextInt();
    int b = reader.nextInt();
    int c = reader.nextInt();
    String[] ss = reader.next(n);
    out.printList(new Solver(n, a, b, c, ss).solve());
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
