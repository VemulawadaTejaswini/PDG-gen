import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    private static class Vertex {
        int num;
        long x;

        Vertex parent;
        List<Vertex> children = new ArrayList<>();

        int depth;
        List<Vertex> path;

        public Vertex(int num, long x) {
            this.num = num;
            this.x = x;
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        long[] x = readLongArray(n, in);
        long l = in.nextLong();

        List<Vertex> allVertices = new ArrayList<>();
        int lastInd = -1;
        Vertex v = null;
        for (int i = 0; i < n; i++) {
            v = new Vertex(i, x[i]);
            if (allVertices.isEmpty()) {
                allVertices.add(v);
                lastInd = 0;
            } else {
                Vertex parent = allVertices.get(allVertices.size() - 1);
                while (lastInd < allVertices.size() && x[i] - allVertices.get(lastInd).x > l) {
                    allVertices.get(lastInd).parent = parent;
                    parent.children.add(allVertices.get(lastInd));
                    lastInd++;
                }
                allVertices.add(v);
            }
        }
        while (lastInd < allVertices.size() - 1) {
            allVertices.get(lastInd).parent = v;
            v.children.add(allVertices.get(lastInd));
            lastInd++;
        }

        boolean[] visited = new boolean[n];
        build(v, visited, new ArrayList<>());

        int q = in.nextInt();
        for (int ii = 0; ii < q; ii++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;

            Vertex v1 = allVertices.get(Math.min(a, b));
            Vertex v2 = allVertices.get(Math.max(a, b));

            long ans = getPathLength(v1, v2, v1.path.size() - 1);
            out.println(ans);
        }

        out.close();
    }

    private static long fastPow(long x, long y) {
        if (x == 1) {
            return 1;
        }
        if (y == 0) {
            return 1;
        }
        long p = fastPow(x, y / 2);
        p *= p;
        if (y % 2 == 1) {
            p *= x;
        }
        return p;
    }

    private static long getPathLength(Vertex v1, Vertex v2, int startInd) {
        if (v1.num == v2.num) {
            return 0;
        }
        if (v2.x <= v1.parent.x) {
            return 1;
        }
        int i = Math.min(v1.path.size() - 1, startInd);
        while (i >= 0) {
            Vertex u = v1.path.get(i);
            if (u.num == v2.num) {
                return fastPow(2, i);
            } else if (u.num < v2.num) {
                return fastPow(2, i) + getPathLength(u, v2, i);
            }
            i--;
        }
        return 0;
    }

    private static void build(Vertex v, boolean[] visited, List<Vertex> path) {
        visited[v.num] = true;
        path.add(v);
        for (Vertex u : v.children) {
            if (!visited[u.num]) {
                u.depth = path.size();

                int i = 1;
                List<Vertex> newPath = new ArrayList<>();
                while (i <= path.size()) {
                    newPath.add(path.get(path.size() - i));
                    i *= 2;
                }
                u.path = newPath;

                build(u, visited, path);
            }
        }
        path.remove(path.size() - 1);
    }

    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(" ");
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}