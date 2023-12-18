import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = in.nextInt();
        Task[] taskList = new Task[n];
        for (int i = 0; i < n; i++)
            taskList[i] = new Task(in.nextInt(), in.nextInt());
        Arrays.sort(taskList);
        long pointer = 0;
        for (int i = 0; i < n && pointer != -1; i++) {
            if ((pointer + taskList[i].l) <= taskList[i].r) {
                pointer += taskList[i].l;
            } else
                pointer = -1;
        }
        if (pointer == -1)
            w.println("No");
        else
            w.println("Yes");

        w.close();
    }
    static class Task implements Comparable<Task> {
        int l, r;
        Task(int l, int r) {
            this.l = l;
            this.r = r;
        }
        public int compareTo(Task t) {
            return this.r - t.r;
        }
    }
    static int binaryLowerBound(long[] a, long k) {
        int l = -1, r = a.length;
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (a[mid] == k)
                return mid;
            else if (a[mid] > k)
                r = mid;
            else
                l = mid;
        }
        return l;
    }
    static boolean nextPermutation(int[] a) {
        int n = a.length;
        int ptr = n - 1;
        while (ptr > 0 && a[ptr - 1] >= a[ptr]) {
            ptr--;
        }

        for (int i = ptr, j = n - 1; i < j; i++, j--) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

        if (ptr == 0) {
            return false;
        }

        for (int i = ptr;; i++) {
            if (a[ptr - 1] < a[i]) {
                int tmp = a[ptr - 1];
                a[ptr - 1] = a[i];
                a[i] = tmp;
                return true;
            }
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
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int peek() {
            if (numChars == -1)
                return -1;
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    return -1;
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar];
        }

        public void skip(int x) {
            while (x-- > 0)
                read();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextString() {
            return next();
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        public String nextLine() {
            StringBuffer buf = new StringBuffer();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r')
                    buf.appendCodePoint(c);
                c = read();
            }
            return buf.toString();
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
        public boolean hasNext() {
            int value;
            while (isSpaceChar(value = peek()) && value != -1)
                read();
            return value != -1;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}