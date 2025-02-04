import java.io.*;
import java.util.*;

// Verify CODE FESTIVAL 2015 final D
// https://atcoder.jp/contests/code-festival-2015-final-open/tasks/codefestival_2015_final_d

class UpdateRangeGetRangeSegmentTree<T, S> {
  public interface Operator<T, S> {
    T multiplyLazyValue(T lazy, int count);
    T getUnitLazy();
    T mergeLazyValue(T lazy1, T lazy2);
    S apply(S value, T lazy);
    S mergeValue(S smallValue, S largeValue);
    S getUnitValue();
  }
  
  private final Operator<T, S> operator;
  private final int n;
  private final List<T> lazies;
  private final List<S> values;
  
  public UpdateRangeGetRangeSegmentTree(Operator<T, S> operator, S[] initialValues) {
    this.operator = operator;
    
    int tempN = 1;
    while (tempN < initialValues.length) {
      tempN *= 2;
    }
    n = tempN;
    lazies = new ArrayList<>();
    values = new ArrayList<>();
    for (int i = 0; i < 2 * n - 1; i++) {
      lazies.add(this.operator.getUnitLazy());
      values.add(null);
    }
    for (int i = 0; i < initialValues.length; i++) {
      values.set(i + n - 1, initialValues[i]);
    }
    for (int i = initialValues.length; i < n; i++) {
      values.set(i + n - 1, this.operator.getUnitValue());
    }
    for (int i = n - 2; i >= 0; i--) {
      values.set(i, this.operator.mergeValue(values.get(2 * i + 1), values.get(2 * i + 2)));
    }
  }
  
  private void eval(int k, int l, int r) {
    if (lazies.get(k).equals(operator.getUnitLazy())) {
      return;
    }
    values.set(k, operator.apply(values.get(k), operator.multiplyLazyValue(lazies.get(k), r - l)));
    if (r - l > 1) {
      lazies.set(2 * k + 1, operator.mergeLazyValue(lazies.get(2 * k + 1), lazies.get(k)));
      lazies.set(2 * k + 2, operator.mergeLazyValue(lazies.get(2 * k + 2), lazies.get(k)));
    }
    lazies.set(k, operator.getUnitLazy());
  }
  
  private void update(int a, int b, T lazy, int k, int l, int r) {
    eval(k, l, r);
    if (b <= l || r <= a) {
      return;
    }
    if (a <= l && r <= b) {
      lazies.set(k, operator.mergeLazyValue(lazies.get(k), lazy));
      eval(k, l, r);
    } else {
      update(a, b, lazy, 2 * k + 1, l, (l + r) / 2);
      update(a, b, lazy, 2 * k + 2, (l + r) / 2, r);
      values.set(k, operator.mergeValue(values.get(2 * k + 1), values.get(2 * k + 2)));
    }
  }
  
  public void update(int a, int b, T lazy) {
    update(a, b, lazy, 0, 0, n);
  }
  
  public void update(int a, T lazy) {
    update(a, a + 1, lazy);
  }
  
  private S getRange(int a, int b, int k, int l, int r) {
    if (b <= l || r <= a) {
      return operator.getUnitValue();
    }
    eval(k, l, r);
    if (a <= l && r <= b) {
      return values.get(k);
    }
    S vl = getRange(a, b, 2 * k + 1, l, (l + r) / 2);
    S vr = getRange(a, b, 2 * k + 2, (l + r) / 2, r);
    return operator.mergeValue(vl, vr);
  }
  
  public S getRange(int a, int b) {
    return getRange(a, b, 0, 0, n);
  }
  
  public S get(int a) {
    return getRange(a, a + 1);
  }

  private void dump(List list) {
    int sum = 0;
    for (int i = 0; sum + (1 << i) <= 2 * n - 1; sum += 1 << i, i++) {
      for (int j = sum; j < sum + (1 << i); j++) {
        System.err.print(list.get(j));
        System.err.print(" ");
      }
      System.err.println();
    }
    System.err.println();
  }
  
  public void dump() {
    System.err.println("values: ");
    dump(values);
    System.err.println("lazies: ");
    dump(lazies);
  }
}

class Query implements Comparable<Query> {
  final int l, r, index;

  Query(int l, int r, int index) {
    this.l = l;
    this.r = r;
    this.index = index;
  }

  public int compareTo(Query query) {
    return this.l - query.l;
  }
}

class Event implements Comparable<Event> {
  final int index;
  final int eventType;
  final int rangeIndex;
  final int colorIndex;

  Event(int index, int eventType, int rangeIndex, int colorIndex) {
    this.index = index;
    this.eventType = eventType;
    this.rangeIndex = rangeIndex;
    this.colorIndex = colorIndex;
  }

  public int compareTo(Event event) {
    if (this.index != event.index) {
      return this.index - event.index;
    }
    return this.eventType - event.eventType;
  }
}

class Solver {
  private static final int EventTypeRangeLeft = 1;
  private static final int EventTypeFill = 2;
  private static final int EventTypeRangeRight = 3;

  private static final Integer ZERO = Integer.valueOf(0);
  private static final UpdateRangeGetRangeSegmentTree.Operator<Integer, Integer> operator = new UpdateRangeGetRangeSegmentTree.Operator<Integer, Integer>() {
    public Integer multiplyLazyValue(Integer lazy, int count) {
      return lazy;
    }

    public Integer getUnitLazy() {
      return ZERO;
    }

    public Integer mergeLazyValue(Integer lazy1, Integer lazy2) {
      return lazy1 + lazy2;
    }
    
    public Integer apply(Integer value, Integer lazy) {
      return value + lazy;
    }

    public Integer mergeValue(Integer smallValue, Integer largeValue) {
      return smallValue + largeValue;
    }

    public Integer getUnitValue() {
      return ZERO;
    }
  };

  final int n, q;
  final int[] cs;
  final int[][] lrs;

  Solver(int n, int q, int[] cs, int[][] lrs) {
    this.n = n;
    this.q = q;
    this.cs = cs;
    this.lrs = lrs;
  }

  List<Integer> solve() {
    Query[] queries = new Query[q];
    for (int i = 0; i < q; i++) {
      queries[i] = new Query(lrs[i][0], lrs[i][1], i);
    }
    Arrays.sort(queries);

    List<Event> events = new ArrayList<>();
    for (int i = 0; i < q; i++) {
      events.add(new Event(queries[i].l - 1, EventTypeRangeLeft, i, 0));
      events.add(new Event(queries[i].r - 1, EventTypeRangeRight, i, 0));
    }
    for (int i = 0; i < n; i++) {
      events.add(new Event(i, EventTypeFill, 0, cs[i]));
    }
    Collections.sort(events);

    int[] answers = new int[q];

    Integer[] initialValues = new Integer[q];
    Arrays.fill(initialValues, ZERO);

    UpdateRangeGetRangeSegmentTree<Integer, Integer> segmentTree = new UpdateRangeGetRangeSegmentTree<Integer, Integer>(operator, initialValues);

    int[] lastFillRightIndex = new int[n];
    int currentRightIndex = 0;
    for (Event event : events) {
      switch (event.eventType) {
        case EventTypeRangeLeft: {
          currentRightIndex = Math.max(currentRightIndex, event.rangeIndex + 1);
          break;
        }
        case EventTypeFill: {
          int color = event.colorIndex;
          segmentTree.update(lastFillRightIndex[color], currentRightIndex, 1);
          lastFillRightIndex[color] = currentRightIndex;
          break;
        }
        case EventTypeRangeRight: {
          answers[queries[event.rangeIndex].index] = segmentTree.get(event.rangeIndex);
          break;
        }
      }
    }

    List<Integer> answerList = new ArrayList<>();
    for (int answer : answers) {
      answerList.add(answer);
    }
    return answerList;
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    int q = reader.nextInt();
    int[] cs = reader.nextInt(n);
    int[][] lrs = reader.nextInt(q, 2);
    out.printList(new Solver(n, q, cs, lrs).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestWriter extends PrintWriter {
  ContestWriter(PrintStream printStream) {
    super(printStream);
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

class MyAssert {
  public static void myAssert(boolean flag, String message) {
    if (!flag) {
      throw new RuntimeException(message);
    }
  }
 
  public static void myAssert(boolean flag) {
    myAssert(flag, "");
  }
}
