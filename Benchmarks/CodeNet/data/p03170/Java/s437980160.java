import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] val = new int[n];
        boolean[] b = new boolean[k + 1];
        for (int i = 0; i < n; i++) {
            val[i] = in.nextInt();
            b[val[i]] = true;
        }
        for (int i = 0; i <= k; i++) {
            if (!b[i]) {
                boolean t = true;
                for (int j = 0; j < n; j++) {
                    if ((i - val[j] >= 0)) {
                        t = t && b[i - val[j]];
                    }
                }
                b[i] = !t;
            }
        }
        if (b[k]) {
            out.println("First");
        } else {
            out.println("Second");
        }
        out.close();
    }

    private static void dfs(Vertex v, Set<Vertex> visited, Stack<Vertex> st) {
        visited.add(v);
        for (Vertex n : v.adj) {
            if (!visited.contains(n))
                dfs(n, visited, st);
        }
        st.add(v);
    }

    static class Vertex {
        int i;

        public Vertex(int i) {
            this.i = i;
        }

        List<Vertex> adj = new ArrayList<>();
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}
