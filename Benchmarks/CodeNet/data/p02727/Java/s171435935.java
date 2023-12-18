import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Random;
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
        ERedAndGreenApples solver = new ERedAndGreenApples();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERedAndGreenApples {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int eatRed = in.ni(), eatGreen = in.ni(), redApples = in.ni(), greenApples = in.ni(), colorApples = in.ni();

            int[] red = in.nia(redApples), green = in.nia(greenApples), color = in.nia(colorApples);

            _Ez_Int_ReverseSort.sort(red);
            _Ez_Int_ReverseSort.sort(green);
            _Ez_Int_ReverseSort.sort(color);

            int[] arr = new int[eatRed + eatGreen];
            int index = 0;
            for (int i = 0; i < eatRed; i++) {
                arr[index++] = red[i];
            }
            for (int i = 0; i < eatGreen; i++) {
                arr[index++] = green[i];
            }
            _Ez_Int_Sort.sort(arr);
            long sum = new NumberTheory().sum(arr);

            long ans = sum;
            for (int i = 0, j = 0; i < arr.length; i++) {
                sum -= arr[i];
                sum += j < color.length ? color[j] : arr[i];
//            out.println(sum+"  "+arr[i]);
                if (sum >= ans) {
                    ans = sum;
                    j++;
                } else break;
            }

            out.println(ans);


        }

    }

    static final class _Ez_Int_Sort {
        private static final double HEAPSORT_DEPTH_COEFFICIENT = 2.0;
        private static final Random rnd = new Random();

        private _Ez_Int_Sort() {
        }

        private static int maxQuickSortDepth(int length) {
            if (length <= 1) {
                return 0;
            }
            int log = Integer.numberOfTrailingZeros(Integer.highestOneBit(length - 1)) + 1;
            return (int) (HEAPSORT_DEPTH_COEFFICIENT * log);
        }

        public static void sort(/*C*/int/*C*/[] a) {
            quickSort(a, 0, a.length, 0, maxQuickSortDepth(a.length));
        }

        private static void quickSort(/*C*/int/*C*/[] a, int left, int right, int depth, int maxDepth) {
            if (right - left <= 1) {
                return;
            }
            if (depth > maxDepth) {
                heapSort(a, left, right - left);
                return;
            }
            final /*C*/ int/*C*/ pivot = a[left + rnd.nextInt(right - left)];
            int i = left;
            int j = right - 1;
            do {
                while (a[i] < pivot) i++;
                while (pivot < a[j]) j--;
                if (i <= j) {
                    /*C*/
                    int/*C*/ tmp = a[i];
                    a[i++] = a[j];
                    a[j--] = tmp;
                }
            } while (i <= j);
            quickSort(a, left, j + 1, depth + 1, maxDepth);
            quickSort(a, i, right, depth + 1, maxDepth);
        }

        private static void heapSort(/*C*/int/*C*/[] a, int offset, int size) {
            // If size <= 1, nothing is executed
            for (int i = (size >>> 1) - 1; i >= 0; i--) {
                down(a, i, offset, size);
            }
            for (int i = size - 1; i > 0; i--) {
                /*C*/
                int/*C*/ tmp = a[offset];
                a[offset] = a[offset + i];
                a[offset + i] = tmp;
                down(a, 0, offset, i);
            }
        }

        private static void down(/*C*/int/*C*/[] a, int index, int offset, int size) {
            final /*C*/ int/*C*/ element = a[offset + index];
            final int firstLeaf = (size >>> 1);
            while (index < firstLeaf) {
                int largestChild = (index << 1) + 1;
                if (largestChild + 1 < size && a[offset + largestChild + 1] > a[offset + largestChild]) {
                    largestChild++;
                }
                if (a[offset + largestChild] <= element) {
                    break;
                }
                a[offset + index] = a[offset + largestChild];
                index = largestChild;
            }
            a[offset + index] = element;
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

        public void println(long i) {
            writer.println(i);
        }

    }

    static class NumberTheory {
        public long sum(int[] arr) {
            long ans = 0;
            for (int i = 0; i < arr.length; i++) ans += arr[i];
            return ans;
        }

    }

    static final class _Ez_Int_ReverseSort {
        private static final double HEAPSORT_DEPTH_COEFFICIENT = 2.0;
        private static final Random rnd = new Random();

        private _Ez_Int_ReverseSort() {
        }

        private static int maxQuickSortDepth(int length) {
            if (length <= 1) {
                return 0;
            }
            int log = Integer.numberOfTrailingZeros(Integer.highestOneBit(length - 1)) + 1;
            return (int) (HEAPSORT_DEPTH_COEFFICIENT * log);
        }

        public static void sort(/*C*/int/*C*/[] a) {
            quickSort(a, 0, a.length, 0, maxQuickSortDepth(a.length));
        }

        private static void quickSort(/*C*/int/*C*/[] a, int left, int right, int depth, int maxDepth) {
            if (right - left <= 1) {
                return;
            }
            if (depth > maxDepth) {
                heapSort(a, left, right - left);
                return;
            }
            final /*C*/ int/*C*/ pivot = a[left + rnd.nextInt(right - left)];
            int i = left;
            int j = right - 1;
            do {
                while (a[i] > pivot) i++;
                while (pivot > a[j]) j--;
                if (i <= j) {
                    /*C*/
                    int/*C*/ tmp = a[i];
                    a[i++] = a[j];
                    a[j--] = tmp;
                }
            } while (i <= j);
            quickSort(a, left, j + 1, depth + 1, maxDepth);
            quickSort(a, i, right, depth + 1, maxDepth);
        }

        private static void heapSort(/*C*/int/*C*/[] a, int offset, int size) {
            // If size <= 1, nothing is executed
            for (int i = (size >>> 1) - 1; i >= 0; i--) {
                down(a, i, offset, size);
            }
            for (int i = size - 1; i > 0; i--) {
                /*C*/
                int/*C*/ tmp = a[offset];
                a[offset] = a[offset + i];
                a[offset + i] = tmp;
                down(a, 0, offset, i);
            }
        }

        private static void down(/*C*/int/*C*/[] a, int index, int offset, int size) {
            final /*C*/ int/*C*/ element = a[offset + index];
            final int firstLeaf = (size >>> 1);
            while (index < firstLeaf) {
                int smallestChild = (index << 1) + 1;
                if (smallestChild + 1 < size && a[offset + smallestChild + 1] < a[offset + smallestChild]) {
                    smallestChild++;
                }
                if (a[offset + smallestChild] >= element) {
                    break;
                }
                a[offset + index] = a[offset + smallestChild];
                index = smallestChild;
            }
            a[offset + index] = element;
        }

    }
}

