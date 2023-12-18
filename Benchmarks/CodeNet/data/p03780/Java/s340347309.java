import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author GYSHGX868
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      long k = in.nextLong();
      long[] a = IOUtils.readLongArray(in, n);
      IntervalTree tree = new SumIntervalTree(a);
      Set<IntIntPair> valid = new HashSet<>();
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          long sum = tree.query(i, j);
          if (sum >= k) {
            valid.add(IntIntPair.makePair(i, j));
          }
        }
      }
      int answer = 0;
      for (int i = 0; i < n; i++) {
        long origin = a[i];
        tree.update(i, i, -origin);
        if (judge(valid, tree, k)) {
          answer++;
        }
        tree.update(i, i, origin);
      }
      out.printLine(answer);
    }

    private boolean judge(Set<IntIntPair> valid, IntervalTree tree, long k) {
      for (IntIntPair pair : valid) {
        long sum = tree.query(pair.first, pair.second);
        if (sum < k) {
          return false;
        }
      }
      return true;
    }

  }

  static class IntIntPair implements Comparable<IntIntPair> {
    public final int first;
    public final int second;

    public IntIntPair(int first, int second) {
      this.first = first;
      this.second = second;
    }

    public static IntIntPair makePair(int first, int second) {
      return new IntIntPair(first, second);
    }

    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      IntIntPair pair = (IntIntPair) o;
      return first == pair.first && second == pair.second;
    }

    public int hashCode() {
      int result = first;
      result = 31 * result + second;
      return result;
    }

    public String toString() {
      return "(" + first + ", " + second + ")";
    }

    public int compareTo(IntIntPair o) {
      int value = Integer.compare(first, o.first);
      if (value != 0) {
        return value;
      }
      return Integer.compare(second, o.second);
    }

  }

  static abstract class IntervalTree {
    protected int size;

    protected IntervalTree(int size) {
      this(size, true);
    }

    public IntervalTree(int size, boolean shouldInit) {
      this.size = size;
      int nodeCount = Math.max(1, Integer.highestOneBit(size) << 2);
      initData(size, nodeCount);
      if (shouldInit) {
        init();
      }
    }

    protected abstract void initData(int size, int nodeCount);

    protected abstract void initAfter(int root, int left, int right, int middle);

    protected abstract void initBefore(int root, int left, int right, int middle);

    protected abstract void initLeaf(int root, int index);

    protected abstract void updatePostProcess(
        int root, int left, int right, int from, int to, long delta, int middle);

    protected abstract void updatePreProcess(
        int root, int left, int right, int from, int to, long delta, int middle);

    protected abstract void updateFull(int root, int left, int right, int from, int to, long delta);

    protected abstract long queryPostProcess(
        int root, int left, int right, int from, int to, int middle,
        long leftResult, long rightResult);

    protected abstract void queryPreProcess(
        int root, int left, int right, int from, int to, int middle);

    protected abstract long queryFull(int root, int left, int right, int from, int to);

    protected abstract long emptySegmentResult();

    public void init() {
      if (size == 0) {
        return;
      }
      init(0, 0, size - 1);
    }

    private void init(int root, int left, int right) {
      if (left == right) {
        initLeaf(root, left);
      } else {
        int middle = (left + right) >> 1;
        initBefore(root, left, right, middle);
        init(2 * root + 1, left, middle);
        init(2 * root + 2, middle + 1, right);
        initAfter(root, left, right, middle);
      }
    }

    public void update(int from, int to, long delta) {
      update(0, 0, size - 1, from, to, delta);
    }

    protected void update(int root, int left, int right, int from, int to, long delta) {
      if (left > to || right < from) {
        return;
      }
      if (left >= from && right <= to) {
        updateFull(root, left, right, from, to, delta);
        return;
      }
      int middle = (left + right) >> 1;
      updatePreProcess(root, left, right, from, to, delta, middle);
      update(2 * root + 1, left, middle, from, to, delta);
      update(2 * root + 2, middle + 1, right, from, to, delta);
      updatePostProcess(root, left, right, from, to, delta, middle);
    }

    public long query(int from, int to) {
      return query(0, 0, size - 1, from, to);
    }

    protected long query(int root, int left, int right, int from, int to) {
      if (left > to || right < from) {
        return emptySegmentResult();
      }
      if (left >= from && right <= to) {
        return queryFull(root, left, right, from, to);
      }
      int middle = (left + right) >> 1;
      queryPreProcess(root, left, right, from, to, middle);
      long leftResult = query(2 * root + 1, left, middle, from, to);
      long rightResult = query(2 * root + 2, middle + 1, right, from, to);
      return queryPostProcess(root, left, right, from, to, middle, leftResult, rightResult);
    }

  }

  static class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private InputReader.SpaceCharFilter filter;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int read() {
      if (numChars == -1) {
        throw new InputMismatchException();
      }
      if (curChar >= numChars) {
        curChar = 0;
        try {
          numChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (numChars <= 0) {
          return -1;
        }
      }
      return buf[curChar++];
    }

    public int nextInt() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public long nextLong() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      long res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public boolean isSpaceChar(int c) {
      if (filter != null) {
        return filter.isSpaceChar(c);
      }
      return isWhitespace(c);
    }

    public static boolean isWhitespace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public interface SpaceCharFilter {
      boolean isSpaceChar(int ch);

    }

  }

  static class SumIntervalTree extends LongIntervalTree {
    private final long[] array;

    public SumIntervalTree(int size) {
      super(size);
      array = null;
    }

    public SumIntervalTree(long[] array) {
      super(array.length, false);
      this.array = array;
      init();
    }

    protected long initValue(int index) {
      if (array == null) {
        return 0;
      }
      return array[index];
    }

    protected long joinValue(long left, long right) {
      return left + right;
    }

    protected long joinDelta(long was, long delta) {
      return was + delta;
    }

    protected long accumulate(long value, long delta, int length) {
      return value + delta * length;
    }

    protected long neutralValue() {
      return 0;
    }

    protected long neutralDelta() {
      return 0;
    }

  }

  static class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
      writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
      this.writer = new PrintWriter(writer);
    }

    public void close() {
      writer.close();
    }

    public void printLine(int i) {
      writer.println(i);
    }

  }

  static class IOUtils {
    private IOUtils() {
    }

    public static long[] readLongArray(InputReader in, int size) {
      long[] array = new long[size];
      for (int i = 0; i < size; i++) {
        array[i] = in.nextLong();
      }
      return array;
    }

  }

  static abstract class LongIntervalTree extends IntervalTree {
    protected long[] value;
    protected long[] delta;

    protected LongIntervalTree(int size) {
      this(size, true);
    }

    public LongIntervalTree(int size, boolean shouldInit) {
      super(size, shouldInit);
    }

    protected void initData(int size, int nodeCount) {
      value = new long[nodeCount];
      delta = new long[nodeCount];
    }

    protected abstract long joinValue(long left, long right);

    protected abstract long joinDelta(long was, long delta);

    protected abstract long accumulate(long value, long delta, int length);

    protected abstract long neutralValue();

    protected abstract long neutralDelta();

    protected long initValue(int index) {
      return neutralValue();
    }

    protected void initAfter(int root, int left, int right, int middle) {
      value[root] = joinValue(value[2 * root + 1], value[2 * root + 2]);
      delta[root] = neutralDelta();
    }

    protected void initBefore(int root, int left, int right, int middle) {
    }

    protected void initLeaf(int root, int index) {
      value[root] = initValue(index);
      delta[root] = neutralDelta();
    }

    protected void updatePostProcess(
        int root, int left, int right, int from, int to, long delta, int middle) {
      value[root] = joinValue(value[2 * root + 1], value[2 * root + 2]);
    }

    protected void updatePreProcess(
        int root, int left, int right, int from, int to, long delta, int middle) {
      pushDown(root, left, middle, right);
    }

    protected void pushDown(int root, int left, int middle, int right) {
      value[2 * root + 1] = accumulate(value[2 * root + 1], delta[root], middle - left + 1);
      value[2 * root + 2] = accumulate(value[2 * root + 2], delta[root], right - middle);
      delta[2 * root + 1] = joinDelta(delta[2 * root + 1], delta[root]);
      delta[2 * root + 2] = joinDelta(delta[2 * root + 2], delta[root]);
      delta[root] = neutralDelta();
    }

    protected void updateFull(int root, int left, int right, int from, int to, long delta) {
      value[root] = accumulate(value[root], delta, right - left + 1);
      this.delta[root] = joinDelta(this.delta[root], delta);
    }

    protected long queryPostProcess(
        int root, int left, int right, int from, int to, int middle,
        long leftResult, long rightResult) {
      return joinValue(leftResult, rightResult);
    }

    protected void queryPreProcess(int root, int left, int right, int from, int to, int middle) {
      pushDown(root, left, middle, right);
    }

    protected long queryFull(int root, int left, int right, int from, int to) {
      return value[root];
    }

    protected long emptySegmentResult() {
      return neutralValue();
    }

  }
}

