import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
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
    TaskB solver = new TaskB();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int[] t = IOUtils.readIntArray(in, n);
      int m = in.nextInt();
      int[] p = new int[m];
      int[] x = new int[m];
      IOUtils.readIntArrays(in, p, x);
      MiscUtils.decreaseByOne(p);
      long sum = ArrayUtils.sumArray(t);
      for (int i = 0; i < m; i++) {
        out.printLine(sum - t[p[i]] + x[i]);
      }
    }

  }

  static class IOUtils {
    private IOUtils() {
    }

    public static int[] readIntArray(InputReader in, int size) {
      int[] array = new int[size];
      for (int i = 0; i < size; i++) {
        array[i] = in.nextInt();
      }
      return array;
    }

    public static void readIntArrays(InputReader in, int[]... arrays) {
      for (int i = 0; i < arrays[0].length; i++) {
        for (int j = 0; j < arrays.length; j++) {
          arrays[j][i] = in.nextInt();
        }
      }
    }

  }

  static interface IntStream extends Iterable<Integer>, Comparable<IntStream> {
    IntIterator intIterator();

    default Iterator<Integer> iterator() {
      return new Iterator<Integer>() {
        private IntIterator it = intIterator();


        public boolean hasNext() {
          return it.isValid();
        }


        public Integer next() {
          if (!hasNext()) {
            throw new NoSuchElementException();
          }
          int result = it.value();
          it.advance();
          return result;
        }
      };
    }

    default int compareTo(IntStream c) {
      IntIterator it = intIterator();
      IntIterator jt = c.intIterator();
      while (it.isValid() && jt.isValid()) {
        int i = it.value();
        int j = jt.value();
        if (i < j) {
          return -1;
        } else if (i > j) {
          return 1;
        }
        it.advance();
        jt.advance();
      }
      if (it.isValid()) {
        return 1;
      }
      if (jt.isValid()) {
        return -1;
      }
      return 0;
    }

    default long sum() {
      long result = 0;
      for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
        result += it.value();
      }
      return result;
    }

  }

  static interface IntReversibleCollection extends IntCollection {
  }

  static class ArrayUtils {
    public static long sumArray(int[] array) {
      return new IntArray(array).sum();
    }

  }

  static abstract class IntAbstractStream implements IntStream {
    public String toString() {
      return toString(" ");
    }

    public String toString(String separator) {
      StringBuilder builder = new StringBuilder();
      boolean first = true;
      for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
        if (first) {
          first = false;
        } else {
          builder.append(separator);
        }
        builder.append(it.value());
      }
      return builder.toString();
    }

    public boolean equals(Object o) {
      if (!(o instanceof IntStream)) {
        return false;
      }
      IntStream c = (IntStream) o;
      IntIterator it = intIterator();
      IntIterator jt = c.intIterator();
      while (it.isValid() && jt.isValid()) {
        if (it.value() != jt.value()) {
          return false;
        }
        it.advance();
        jt.advance();
      }
      return !it.isValid() && !jt.isValid();
    }

    public int hashCode() {
      int result = 0;
      for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
        result *= 31;
        result += it.value();
      }
      return result;
    }

  }

  static class MiscUtils {
    private MiscUtils() {
    }

    public static void decreaseByOne(int[]... arrays) {
      for (int[] array : arrays) {
        for (int i = 0; i < array.length; i++) {
          array[i]--;
        }
      }
    }

  }

  static interface IntList extends IntReversibleCollection {
    public abstract int get(int index);

    public abstract void removeAt(int index);

    public default IntIterator intIterator() {
      return new IntIterator() {
        private int at;
        private boolean removed;


        public int value() {
          if (removed) {
            throw new IllegalStateException();
          }
          return get(at);
        }


        public boolean advance() {
          at++;
          removed = false;
          return isValid();
        }


        public boolean isValid() {
          return !removed && at < size();
        }


        public void remove() {
          removeAt(at);
          at--;
          removed = true;
        }
      };
    }

  }

  static interface IntIterator {
    int value() throws NoSuchElementException;

    boolean advance();

    boolean isValid();

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

    public void printLine(long i) {
      writer.println(i);
    }

  }

  static class IntArray extends IntAbstractStream implements IntList {
    private int[] data;

    public IntArray(int[] arr) {
      data = arr;
    }

    public int size() {
      return data.length;
    }

    public int get(int at) {
      return data[at];
    }

    public void removeAt(int index) {
      throw new UnsupportedOperationException();
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

  static interface IntCollection extends IntStream {
    int size();

  }
}

