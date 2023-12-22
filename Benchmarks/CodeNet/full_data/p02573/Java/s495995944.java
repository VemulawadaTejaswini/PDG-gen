import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        int N;
        int M;
        int[] A;
        int[] B;

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            N = in.Int();
            M = in.Int();
            A = new int[M];
            B = new int[M];
            for (int i = 0; i < M; i++) {
                A[i] = in.Int() - 1;
                B[i] = in.Int() - 1;
            }

            D.UnionFind uf = new D.UnionFind(N);
            for (int i = 0; i < M; i++) {
                uf.connect(A[i], B[i]);
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                max = Math.max(max, uf.size(i));
            }
            out.println(max);
        }

        static class UnionFind {
            private final List<Integer> parent;

            UnionFind(int N) {
                parent = new ArrayList<Integer>();
                Integer[] values = new Integer[N];
                Arrays.fill(values, -1);
                parent.addAll(Arrays.asList(values));
            }

            public int root(int A) {
                if (parent.get(A) < 0)
                    return A;
                int root = root(parent.get(A));
                parent.set(A, root);
                return root;
            }

            public int size(int A) {
                return -parent.get(root(A));
            }

            public boolean connect(int A, int B) {
                A = root(A);
                B = root(B);
                if (A == B) {
                    return false;
                }

                if (size(A) < size(B)) {
                    int temp = A;
                    A = B;
                    B = temp;
                }

                parent.set(A, parent.get(A) + parent.get(B));
                parent.set(B, A);
                return true;
            }

        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

