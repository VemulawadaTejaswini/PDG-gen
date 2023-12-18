import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        Task solver = new Task();
        int t = 1;
        while (t --> 0) solver.solve(1, scan, out);
        out.close();
    }

    static class Task {
        static int maxDeg = 0;
        static Vertex maxVertex = null;

        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            int n = scan.nextInt();
            Vertex[] tree = new Vertex[n];
            ArrayList<Edge> edges = new ArrayList<>();
            for(int i = 0; i < n; i++) tree[i] = new Vertex();
            for(int i = 0; i < n-1; i++) {
                Vertex a = tree[scan.nextInt()-1], b = tree[scan.nextInt()-1];
                Edge ab = new Edge(b), ba = new Edge(a);
                a.adj.add(ab);
                b.adj.add(ba);
                ab.reverse = ba;
                ba.reverse = ab;
                edges.add(ab);
                if(a.adj.size() > maxDeg) {
                    maxDeg = a.adj.size();
                    maxVertex = a;
                }
                if(b.adj.size() > maxDeg) {
                    maxDeg = b.adj.size();
                    maxVertex = b;
                }
            }
            maxVertex.colorEdges(null);

            out.println(maxDeg);
            for(Edge e : edges) out.println(e.color);

        }

        static class Vertex {
            ArrayList<Edge> adj;
            int colorBefore;

            public Vertex() {
                adj = new ArrayList<>();
                colorBefore = -1;
            }

            public void colorEdges(Vertex parent) {
                int currColor = 1;
                for(Edge e : adj) {
                    if(e.to == parent) continue;
                    if(parent != null && currColor == colorBefore) currColor++;
                    e.color = currColor;
                    e.reverse.color = currColor;
                    e.to.colorBefore = currColor;
                    e.to.colorEdges(this);
                    currColor++;
                }
            }
        }

        static class Edge {
            Vertex to;
            Edge reverse;
            int color;

            public Edge(Vertex b) {
                to = b;
                color = -1;
                reverse = null;
            }
        }
    }

    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static void shuffle(long[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            long temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}