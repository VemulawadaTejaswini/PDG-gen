import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    static class UnionFind {
        List<Integer> Parent;
        UnionFind(int N) {
            Parent = new ArrayList<Integer>();
            Integer[] values = new Integer[N];
            Arrays.fill(values, -1);
            Parent.addAll(Arrays.asList(values));
        }
        int root(int A) {
            if (Parent.get(A) < 0)
                return A;
            int root = root(Parent.get(A));
            Parent.set(A, root);
            return root;
        }
        int size(int A) {
            return -Parent.get(root(A));
        }

        boolean connect(int A, int B) {
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

            Parent.set(A, Parent.get(A) + Parent.get(B));
            Parent.set(B, A);

            return true;
        }
    }
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int N = in.nextInt();
        int M = in.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        for (int i=0;i<M;i++) {
            a[i] = in.nextInt()-1;
            b[i] = in.nextInt()-1;
        }
        int ans = 0;
        for (int i=0;i<M;i++) {
            UnionFind uf = new UnionFind(N);
            for (int j=0;j<M;j++) {
                if (j==i) {
                    continue;
                }
                uf.connect(a[j], b[j]);
            }
            if (uf.size(0)!=N) {
                ans++;
            }
        }
        out.println(ans);

        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
