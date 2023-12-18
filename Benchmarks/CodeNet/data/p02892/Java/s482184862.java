import java.io.*;
import java.util.*;

public class Main {

    class Reader {
        BufferedReader in;

        Reader() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        StringTokenizer tok = new StringTokenizer("");

        String next() throws IOException {
            if (!tok.hasMoreTokens()) {
                tok = new StringTokenizer(in.readLine());
            }
            return tok.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(in.readLine());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    class Writer {
        PrintWriter out;

        Writer() {
            out = new PrintWriter(System.out);
        }

        StringBuilder str = new StringBuilder();

        void print(Object o) {
            str.append(o);
        }

        void close() {
            out.write(str.toString());
            out.close();
        }
    }

    int n;

    ArrayList<Integer> g[];


    boolean must = true;

    int bfs(int v0) {
        int d[] = new int[n];
        d[v0] = 1;
        HashSet<Integer> q = new HashSet<>();
        q.add(v0);
        int l = 0;
        while (q.size() > 0) {
            l++;
            HashSet<Integer> q1 = new HashSet<>();
            for (int v : q) {
                for (int u : g[v]) {
                    if (d[u] == 0) {
                        d[u] = l + 1;
                        q1.add(u);
                    } else {
                        if (d[u] == d[v]) {
                            must = false;
                        }
                    }
                }
            }
            q = q1;
        }
        return l;
    }

    void slave() throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        n = in.nextInt();
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            String s = in.next();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') {
                    g[i].add(j);
                }
            }
        }
        int mx = -1;
        for (int v = 0; v < n; v++) {
            must = true;
            int len = bfs(v);
            if (must) {
                mx = Math.max(len, mx);
            }
        }
        out.print(mx);
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().slave();
    }
}