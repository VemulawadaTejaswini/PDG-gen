import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CCountOrder solver = new CCountOrder();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCountOrder {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt();
            int p1[] = c.readIntArray(n), q1[] = c.readIntArray(n);

            //calculating total number of permutations possible
            int perm = 1;
            for (int i = 2; i <= n; i++) {
                perm *= i;
            }

            //generating 1st permutation
            int init[] = new int[n];
            for (int i = 0; i < n; i++) {
                init[i] = i + 1;
            }

            // initialising a and b
            int a = -1, b = -1;

            //Generate all Possible Permutations!!!
            for (int i = 1; i <= perm; i++) {
                //if permutation p1 == current permutation
                if (Arrays.equals(p1, init)) {
                    a = i;
                }
                // if permutation q1 == current permutation
                if (Arrays.equals(q1, init)) {
                    b = i;
                }
                // Producing next permutation (My Library Code)
                Utils.nextPermutation(init);
            }

            //Lastly Printing the absolute difference!!!
            w.printLine(Math.abs(b - a));
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

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
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

        public int readInt() {
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
            public boolean isSpaceChar(int ch);

        }

    }

    static class Utils {
        public static void nextPermutation(int[] nums) {
            //find first decreasing digit
            int mark = -1;
            for (int i = nums.length - 1; i > 0; i--) {
                if (nums[i] > nums[i - 1]) {
                    mark = i - 1;
                    break;
                }
            }

            if (mark == -1) {
                reverse(nums, 0, nums.length - 1);
                return;
            }

            int idx = nums.length - 1;
            for (int i = nums.length - 1; i >= mark + 1; i--) {
                if (nums[i] > nums[mark]) {
                    idx = i;
                    break;
                }
            }

            swap(nums, mark, idx);

            reverse(nums, mark + 1, nums.length - 1);
        }

        private static void swap(int[] nums, int i, int j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }

        private static void reverse(int[] nums, int i, int j) {
            while (i < j) {
                swap(nums, i, j);
                i++;
                j--;
            }
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
}

