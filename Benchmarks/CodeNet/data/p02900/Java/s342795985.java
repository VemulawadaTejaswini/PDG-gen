import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDisjointSetOfCommonDivisors solver = new DDisjointSetOfCommonDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDisjointSetOfCommonDivisors {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            long a = s.nextLong();
            long b = s.nextLong();
            ArrayList<Long> l1 = DDisjointSetOfCommonDivisors.Maths.printDivisors(a);
            ArrayList<Long> l2 = DDisjointSetOfCommonDivisors.Maths.printDivisors(b);
            HashSet<Long> set = new HashSet<>(l1);

            HashSet<Long> fin = new HashSet<>();
            for (long k1 : l2) {
                if (set.contains(k1)) {
                    fin.add(k1);
                }
            }
//        out.println(fin);
            fin.remove(1L);

            long[] arr = new long[fin.size()];

            Iterator<Long> iter = fin.iterator();
            int k = 0;
            while (iter.hasNext()) {
                arr[k++] = iter.next();
            }
            DDisjointSetOfCommonDivisors.arrays.sort(arr);
            out.println(largestGCDSubsequence(arr) + 1);

        }

        static int largestGCDSubsequence(long[] arr) {
            if (arr.length == 0) {
                return 0;
            }
            HashMap<Long, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], i);
            }

            int i = 0;
            int n = arr.length;
            int count = 0;
            long max = arr[n - 1];
            while (i < n) {
                if (map.containsKey(arr[i])) {
                    int j = 2;
                    long curr = arr[i] * j;
                    while (curr <= max) {
                        map.remove(curr);
                        j++;
                        curr = j * arr[i];
                    }
                }
                i++;
            }

            return map.size();
        }

        private static class Maths {
            static ArrayList<Long> printDivisors(long n) {
                // Note that this loop runs till square root
                ArrayList<Long> list = new ArrayList<>();
                for (long i = 1; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        if (n / i == i) {
                            list.add(i);
                        } else {
                            list.add(i);
                            list.add(n / i);
                        }
                    }
                }
                return list;
            }

        }

        private static class arrays {
            static void merge(long arr[], int l, int m, int r) {
                int n1 = m - l + 1;
                int n2 = r - m;
                long L[] = new long[n1];
                long R[] = new long[n2];
                for (int i = 0; i < n1; ++i)
                    L[i] = arr[l + i];
                for (int j = 0; j < n2; ++j)
                    R[j] = arr[m + 1 + j];
                int i = 0, j = 0;
                int k = l;
                while (i < n1 && j < n2) {
                    if (L[i] <= R[j]) {
                        arr[k] = L[i];
                        i++;
                    } else {
                        arr[k] = R[j];
                        j++;
                    }
                    k++;
                }

                while (i < n1) {
                    arr[k] = L[i];
                    i++;
                    k++;
                }

                while (j < n2) {
                    arr[k] = R[j];
                    j++;
                    k++;
                }
            }

            static void sort(long arr[], int l, int r) {
                if (l < r) {
                    int m = (l + r) / 2;
                    sort(arr, l, m);
                    sort(arr, m + 1, r);
                    merge(arr, l, m, r);
                }
            }

            static void sort(long[] arr) {
                sort(arr, 0, arr.length - 1);
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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
            public boolean isSpaceChar(int ch);

        }

    }
}

