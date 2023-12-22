import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.InputMismatchException;


/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Manan Patel
 */
public class Main{
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter w = new PrintWriter(outputStream);
        Solution solver = new Solution();
        //int testCount = Integer.parseInt(in.next());
        //for (int i = 1; i <= testCount; i++)
            solver.solve(1 , in, w);
        w.close();
    }

    static class Solution {
        public void solve(int tc, InputReader sc, PrintWriter w) {
            int a[] = new int[5];
            for (int i = 0 ; i < 5 ; i++)
                a[i] = sc.nextInt();
            for (int i = 0 ; i < 5 ; i++){
                if (a[i] == 0){
                    w.println(i + 1);
                    return;
                }
            }
        }
    }
    static class f{
        public static long max(long a[]){
            long ans = Long.MIN_VALUE;
            for (long i : a)
                ans = Math.max(ans , i);
            return ans;
        }
        public static long power(long x, int y){
            long res = 1;
            while (y > 0)
            {
                if ((y & 1) == 1)
                    res = (res*x);
                y = y >> 1;
                x = x * x;
            }
            return res;
        }
        public static long powerm(long x, long y, long p) {
            long res = 1;
            x %= p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res *= x;
                    res %= p;
                }
                y >>= 1;
                x *= x;
                x %= p;
            }
            return res;
        }
        public static void sort(int[] arr) {
            int n = arr.length, mid, h, s, l, i, j, k;
            int[] res = new int[n];
            for (s = 1; s < n; s <<= 1) {
                for (l = 0; l < n - 1; l += (s << 1)) {
                    h = Math.min(l + (s << 1) - 1, n - 1);
                    mid = Math.min(l + s - 1, n - 1);
                    i = l;
                    j = mid + 1;
                    k = l;
                    while (i <= mid && j <= h)
                        res[k++] = (arr[i] <= arr[j] ? arr[i++] : arr[j++]);
                    while (i <= mid)
                        res[k++] = arr[i++];
                    while (j <= h)
                        res[k++] = arr[j++];
                    for (k = l; k <= h; k++)
                        arr[k] = res[k];
                }
            }
        }
        public static long gcd(long a, long b)
        {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }

        public static long findGCD(long arr[], int n)
        {
            long result = arr[0];
            for (int i = 1; i < n; i++)
                result = gcd(arr[i], result);
            return result;
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
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

}
