import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Rectrangle solver = new Rectrangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class Rectrangle {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] s = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                s[i] = in.nextInt();
                map.put(s[i], map.getOrDefault(s[i], 0) + 1);
            }
            ArrayUtils.sort(s);
            ArrayUtils.reverse(s);

            int first = -1, second = -1;
            for (int i = 0; i < n; i++) {
                int cp = map.getOrDefault(s[i], 0);
                if (cp >= 4) {
                    out.println((long) s[i] * (long) s[i]);
                    return;
                }
                if (cp >= 2) {
                    if (first == -1) {
                        first = s[i];
                        map.remove(s[i]);
                    } else if (second == -1) {
                        second = s[i];
                        map.remove(s[i]);
                    }
                }
                if (first > -1 && second > -1) {
                    out.println((long) first * (long) second);
                    return;
                }
            }
            if (first > -1 && second > -1) {
                out.println((long) first * (long) second);
            } else {
                out.println(0);
            }
        }

    }

    static class ArrayUtils {
        public static void reverse(int[] arr) {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        }

        public static void sort(int[] arr) {
            int n = arr.length;
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                int p = r.nextInt(n + 1);
                if (p < n) {
                    int temp = arr[i];
                    arr[i] = arr[p];
                    arr[p] = temp;
                }
            }
            Arrays.sort(arr);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException ex) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

