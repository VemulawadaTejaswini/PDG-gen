import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
        public static void main(String[] args) {
                InputStream inputStream = System.in;
                OutputStream outputStream = System.out;
                InputReader in = new InputReader(inputStream);
                PrintWriter out = new PrintWriter(outputStream);
                TaskC solver = new TaskC();
                solver.solve(1, in, out);
                out.close();
        }

        static class TaskC {
                int[][] perm = new int[10][3];
                int ind = 0;
                int[] p = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 2};
                int[] q = new int[]{1, 1, 1, 2, 2, 3, 2, 2, 3, 3};
                int[] r = new int[]{2, 3, 4, 3, 4, 4, 3, 4, 4, 4};

                public void solve(int testNumber, InputReader in, PrintWriter out) {
                        //generatePermutation(new int[]{0,1,2},3,3);

                        getCombination(new int[]{0, 1, 2, 3, 4}, 5, 3);
                        int n = in.i();
                        long[] d = new long[5];
                        for (int i = 0; i < n; i++) {
                                String s = in.s();
                                if (s.charAt(0) == 'M') d[0]++;
                                if (s.charAt(0) == 'A') d[1]++;
                                if (s.charAt(0) == 'R') d[2]++;
                                if (s.charAt(0) == 'C') d[3]++;
                                if (s.charAt(0) == 'H') d[4]++;
                        }

                        long ans = 0;
                        for (int i = 0; i < 10; i++) {
                                ans += d[p[i]] * d[q[i]] * d[r[i]];
                        }
                        out.println(ans);
                }

                void getCombination(int[] a, int n, int r) {
                        int[] data = new int[n];
                        combinationUtil(a, n, r, 0, data, 0);
                }

                private void combinationUtil(int[] a, int n, int r, int index, int[] data, int i) {
                        if (index == r) {
                                perm[ind++] = Arrays.copyOf(data, r);
                                return;
                        }
                        if (i >= n) return;
                        data[index] = a[i];
                        combinationUtil(a, n, r, index + 1, data, i + 1);
                        combinationUtil(a, n, r, index, data, i + 1);
                }

        }

        static class InputReader {
                InputStream is;
                private byte[] inbuf = new byte[1024];
                public int lenbuf = 0;
                public int ptrbuf = 0;

                public InputReader(InputStream is) {
                        this.is = is;
                }

                private int readByte() {
                        if (lenbuf == -1) throw new InputMismatchException();
                        if (ptrbuf >= lenbuf) {
                                ptrbuf = 0;
                                try {
                                        lenbuf = is.read(inbuf);
                                } catch (IOException e) {
                                        throw new InputMismatchException();
                                }
                                if (lenbuf <= 0) return -1;
                        }
                        return inbuf[ptrbuf++];
                }

                private boolean isSpaceChar(int c) {
                        return !(c >= 33 && c <= 126);
                }

                private int skip() {
                        int b;
                        while ((b = readByte()) != -1 && isSpaceChar(b)) ;
                        return b;
                }

                public String s() {
                        int b = skip();
                        StringBuilder sb = new StringBuilder();
                        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
                                sb.appendCodePoint(b);
                                b = readByte();
                        }
                        return sb.toString();
                }

                public int i() {
                        int num = 0, b;
                        boolean minus = false;
                        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
                        if (b == '-') {
                                minus = true;
                                b = readByte();
                        }

                        while (true) {
                                if (b >= '0' && b <= '9') {
                                        num = num * 10 + (b - '0');
                                } else {
                                        return minus ? -num : num;
                                }
                                b = readByte();
                        }
                }

        }
}

