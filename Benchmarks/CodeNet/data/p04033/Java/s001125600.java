import java.io.*;
import java.nio.Buffer;
import java.util.*;

import static java.lang.Integer.min;


public class Main {
        static InputReader in = new InputReader(System.in);
        static PrintWriter out = new PrintWriter(System.out);

        static int sgn(int x) {
                return Integer.compare(x, 0);
        }

        public static void main(String[] args) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (a == 0 || b == 0 || sgn(a) != sgn(b)) out.println("Zero");
                else {
                        if (sgn(a) == 1 || Math.abs(b - a + 1) % 2 == 0) out.println("Positive");
                        else out.println("Negative");
                }
                out.close();
        }


        static class Edge implements Comparable<Edge>  {
                int a, b, w;
                Edge(int a, int b, int w) {
                        this.a = a;
                        this.b = b;
                        this.w = w;
                }
                public int compareTo(Edge compareEdge) {
                        return this.w - compareEdge.w;
                }
        };
        static class dsu {
                int[] par, rk;
                dsu(int n) {
                        par = new int[n + 1];
                        rk = new int[n + 1];
                        for (int i = 1; i <= n; i++) {
                                par[i] = i;
                                rk[i] = 1;
                        }
                }

                int find(int x) {
                        while (x != par[x]) x = par[x];
                        return x;
                }

                void unite(int a, int b) {
                        a = find(a);
                        b = find(b);
                        if (a != b) {
                                if (rk[a] < rk[b]) {
                                        int temp = a;
                                        a = b;
                                        b = temp;
                                }
                                par[b] = a;
                                rk[a] += rk[b];
                        }
                }
        }
        static class InputReader {
                BufferedReader reader;
                StringTokenizer tokenizer;
                public InputReader(InputStream stream) {
                        reader = new BufferedReader(new InputStreamReader(stream), 32768);
                        tokenizer = null;
                }
                String next() {
                        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                                try { tokenizer = new StringTokenizer(reader.readLine()); }
                                catch (IOException e) { throw new RuntimeException(e); }
                        }
                        return tokenizer.nextToken();
                }
                public int nextInt() { return Integer.parseInt(next()); }
                public long nextLong() { return Long.parseLong(next()); }
                public double nextDouble() { return Double.parseDouble(next()); }
        }
}