import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author L_aka_ryuga
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CMinimization solver = new CMinimization();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMinimization {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int n = in.ni(), k = in.ni();
            int[] arr = in.nia(n);
            int min = new NumberTheory().min(arr);
            _Ez_Int_ArrayList list = new _Ez_Int_ArrayList();

            list.add(1);
            for (int i = 0; i < n; i++) {
                if (arr[i] == min) list.add(i + 1);
            }
            list.add(n + 1);

            int ans = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                int ele1 = list.get(i + 1), ele2 = list.get(i);
                int diff = ele1 - ele2;
                if (diff > 1) {

                    if (k == 1) ans += (diff - 1);
                    else {
                        if (diff == k) ans += 1;
                        else ans += ((diff / k) + 1);

                    }
                }
            }
            out.println(ans);


        }

    }

    static final class PrimitiveHashCalculator {
        private PrimitiveHashCalculator() {
        }

        public static int getHash(int x) {
            return x;
        }

    }

    static interface _Ez_Int_Iterator {
        boolean hasNext();

        int next();

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

        public void println(int i) {
            writer.println(i);
        }

    }

    static interface _Ez_Int_Stack extends _Ez_Int_Collection {
        int size();

        _Ez_Int_Iterator iterator();

        boolean equals(Object object);

        int hashCode();

        String toString();

    }

    static interface _Ez_Int_Collection {
        int size();

        _Ez_Int_Iterator iterator();

        boolean equals(Object object);

        int hashCode();

        String toString();

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

        public int ni() {
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

        public int[] nia(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = ni();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class NumberTheory {
        public int min(int[] arr) {
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; ++i) ans = Math.min(ans, arr[i]);
            return ans;
        }

    }

    static class _Ez_Int_ArrayList implements _Ez_Int_List, _Ez_Int_Stack {
        private static final int DEFAULT_CAPACITY = 10;
        private static final double ENLARGE_SCALE = 2.0;
        private static final int HASHCODE_INITIAL_VALUE = 0x811c9dc5;
        private static final int HASHCODE_MULTIPLIER = 0x01000193;
        private int/*T*/[] array;
        private int size;

        public _Ez_Int_ArrayList() {
            this(DEFAULT_CAPACITY);
        }

        public _Ez_Int_ArrayList(int capacity) {
            if (capacity < 0) {
                throw new IllegalArgumentException("Capacity must be non-negative");
            }
            array = new /*T*/int/*T*/[capacity];
            size = 0;
        }

        public _Ez_Int_ArrayList(_Ez_Int_Collection collection) {
            size = collection.size();
            array = new /*T*/int/*T*/[size];
            int i = 0;
            for (_Ez_Int_Iterator iterator = collection.iterator(); iterator.hasNext(); ) {
                array[i++] = iterator.next();
            }
        }

        public _Ez_Int_ArrayList(/*T*/int/*T*/[] srcArray) {
            size = srcArray.length;
            array = new /*T*/int/*T*/[size];
            System.arraycopy(srcArray, 0, array, 0, size);
        }

        public _Ez_Int_ArrayList(Collection</*W*/Integer/*W*/> javaCollection) {
            size = javaCollection.size();
            array = new /*T*/int/*T*/[size];
            int i = 0;
            for (/*T*/int/*T*/ element : javaCollection) {
                array[i++] = element;
            }
        }

        public int size() {
            return size;
        }

        public _Ez_Int_Iterator iterator() {
            return new _Ez_Int_ArrayListIterator();
        }

        public boolean add(/*T*/int/*T*/ element) {
            if (size == array.length) {
                enlarge();
            }
            array[size++] = element;
            return true;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of range, size = " + size);
            }
            return array[index];
        }

        private void enlarge() {
            int newSize = Math.max(size + 1, (int) (size * ENLARGE_SCALE));
            /*T*/
            int/*T*/[] newArray = new /*T*/int/*T*/[newSize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            _Ez_Int_ArrayList that = (_Ez_Int_ArrayList) o;

            if (size != that.size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (array[i] != that.array[i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hash = HASHCODE_INITIAL_VALUE;
            for (int i = 0; i < size; i++) {
                hash = (hash ^ PrimitiveHashCalculator.getHash(array[i])) * HASHCODE_MULTIPLIER;
            }
            return hash;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < size; i++) {
                sb.append(array[i]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return sb.toString();
        }

        private class _Ez_Int_ArrayListIterator implements _Ez_Int_Iterator {
            private int curIndex = 0;

            public boolean hasNext() {
                return curIndex < size;
            }

            public int next() {
                if (curIndex == size) {
                    throw new NoSuchElementException("Iterator doesn't have more elements");
                }
                return array[curIndex++];
            }

        }

    }

    static interface _Ez_Int_List extends _Ez_Int_Collection {
        int size();

        _Ez_Int_Iterator iterator();

        boolean equals(Object object);

        int hashCode();

        String toString();

    }
}

