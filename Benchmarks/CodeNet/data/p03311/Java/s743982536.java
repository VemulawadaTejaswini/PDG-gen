import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Atharva Nagarkar
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        JoltyScanner in = new JoltyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinearApproximation solver = new CLinearApproximation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinearApproximation {
        public void solve(int testNumber, JoltyScanner in, PrintWriter out) {
            int n = in.nextInt();
            if (n == 1) {
                out.println(0);
                return;
            }
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = in.nextInt() - (i + 1);
            arrays.sort(a);
            int mid = a[n / 2];
            int mid2 = a[n / 2 + 1];
            long ans1 = 0, ans2 = 0;
            for (int i : a) ans1 += Math.abs(i - mid);
            for (int i : a) ans2 += Math.abs(i - mid2);
            out.println(Math.min(ans1, ans2));
        }

    }

    static class arrays {
        public static void sort(int[] a) {
            randomize(a);
            Arrays.sort(a);
        }

        public static void randomize(int[] a) {
            for (int i = 0; i < a.length; i++) {
                int rand = (int) (Math.random() * a.length);
                int temp = a[rand];
                a[rand] = a[i];
                a[i] = temp;
            }
        }

    }

    static class JoltyScanner {
        public int BS = 1 << 16;
        public char NC = (char) 0;
        public byte[] buf = new byte[BS];
        public int bId = 0;
        public int size = 0;
        public char c = NC;
        public double num = 1;
        public BufferedInputStream in;

        public JoltyScanner(InputStream is) {
            in = new BufferedInputStream(is, BS);
        }

        public JoltyScanner(String s) throws FileNotFoundException {
            in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
        }

        public char nextChar() {
            while (bId == size) {
                try {
                    size = in.read(buf);
                } catch (Exception e) {
                    return NC;
                }
                if (size == -1) return NC;
                bId = 0;
            }
            return (char) buf[bId++];
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            num = 1;
            boolean neg = false;
            if (c == NC) c = nextChar();
            for (; (c < '0' || c > '9'); c = nextChar()) {
                if (c == '-') neg = true;
            }
            long res = 0;
            for (; c >= '0' && c <= '9'; c = nextChar()) {
                res = (res << 3) + (res << 1) + c - '0';
                num *= 10;
            }
            return neg ? -res : res;
        }

    }
}

