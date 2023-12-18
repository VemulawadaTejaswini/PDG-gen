import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Collections;
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
        OutputWriter out = new OutputWriter(outputStream);
        FEnclosedPoints solver = new FEnclosedPoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class FEnclosedPoints {
        static final int MOD = 998244353;
        static final int MASK = (int) ((1L << 31) - 1);
        static final int OFFSET = 1 << 30;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            ArrayList<Long> al = new ArrayList<>();
            int[] x = new int[n];
            int[] y = new int[n];
            int[] p2 = new int[n + 1];
            p2[0] = 1;
            for (int i = 0; i < n; i++) {
                p2[i + 1] = 2 * p2[i];
                if (p2[i + 1] >= MOD) p2[i + 1] -= MOD;
                x[i] = in.nextInt() + OFFSET;
                y[i] = in.nextInt() + OFFSET;

                al.add(((long) x[i] << 31) + y[i]);
            }

            long ans = (n * 1L * p2[n - 1]) % MOD;

            ans += (n * 1L * (p2[n - 1] - 1)) % MOD;

            ans -= (4L * (p2[n] - n - 1 + MOD)) % MOD;

            ans %= MOD;
            ans += MOD;
            ans %= MOD;
            Collections.sort(al);
            FEnclosedPoints.Treap.TreapBST t1 = null;

            for (int i = 0; i < n; i++) {
                long v = al.get(i);
                int down1 = FEnclosedPoints.TreapBST.rank(t1, (int) (v & MASK));
                int up1 = i - down1;
                ans += p2[down1] - 1;
                ans += p2[up1] - 1;
                t1 = FEnclosedPoints.TreapBST.insert2(t1, (int) (v & MASK));
            }

            t1 = null;

            for (int i = n - 1; i >= 0; i--) {
                long v = al.get(i);
                int down1 = FEnclosedPoints.TreapBST.rank(t1, (int) (v & MASK));
                int up1 = n - 1 - i - down1;
//            out.println(i + " " + up1 + " " + down1 + " " + ((v & MASK) - OFFSET) + " " + ((v>>31)-OFFSET));
                ans += p2[down1] - 1;
                ans += p2[up1] - 1;
                t1 = FEnclosedPoints.TreapBST.insert2(t1, (int) (v & MASK));
            }
            ans %= MOD;
            ans += MOD;
            ans %= MOD;
            out.println(ans);
        }

        static class TreapBST {
            static Random random = new Random();

            static int getSize(FEnclosedPoints.Treap.TreapBST root) {
                return root == null ? 0 : root.size;
            }

            static FEnclosedPoints.TreapPair.TreapBST split(FEnclosedPoints.Treap.TreapBST root, int minRight) {
                if (root == null)
                    return new FEnclosedPoints.TreapPair.TreapBST(null, null);
                if (root.key >= minRight) {
                    FEnclosedPoints.TreapPair.TreapBST leftSplit = split(root.left, minRight);
                    root.left = leftSplit.right;
                    root.update();
                    leftSplit.right = root;
                    return leftSplit;
                } else {
                    FEnclosedPoints.TreapPair.TreapBST rightSplit = split(root.right, minRight);
                    root.right = rightSplit.left;
                    root.update();
                    rightSplit.left = root;
                    return rightSplit;
                }
            }

            static int rank(FEnclosedPoints.Treap.TreapBST root, int x) {
                if (root == null) return 0;
                if (root.key >= x) return rank(root.left, x);
                else return getSize(root.left) + 1 + rank(root.right, x);
            }

            static FEnclosedPoints.Treap.TreapBST insert2(FEnclosedPoints.Treap.TreapBST root, int key) { // alternative implementation
                return insert_(root, new FEnclosedPoints.Treap.TreapBST(key));
            }

            static FEnclosedPoints.Treap.TreapBST insert_(FEnclosedPoints.Treap.TreapBST root, FEnclosedPoints.Treap.TreapBST node) {
                if (root == null) {
                    return node;
                }
                if (root.prio < node.prio) {
                    FEnclosedPoints.TreapPair.TreapBST t = split(root, node.key);
                    node.left = t.left;
                    node.right = t.right;
                    node.update();
                    return node;
                }
                if (node.key < root.key) {
                    root.left = insert_(root.left, node);
                    root.update();
                    return root;
                } else {
                    root.right = insert_(root.right, node);
                    root.update();
                    return root;
                }
            }

            static class Treap {
                int key;
                long prio;
                FEnclosedPoints.Treap.TreapBST left;
                FEnclosedPoints.Treap.TreapBST right;
                int size;

                Treap(int key) {
                    this.key = key;
                    prio = random.nextLong();
                    size = 1;
                }

                void update() {
                    size = 1 + getSize(left) + getSize(right);
                }

            }

            static class TreapPair {
                FEnclosedPoints.Treap.TreapBST left;
                FEnclosedPoints.Treap.TreapBST right;

                TreapPair(FEnclosedPoints.Treap.TreapBST left, FEnclosedPoints.Treap.TreapBST right) {
                    this.left = left;
                    this.right = right;
                }

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

        public void println(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
            writer.print('\n');
        }

        public void close() {
            writer.close();
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
            while (isSpaceChar(c)) c = read();
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

