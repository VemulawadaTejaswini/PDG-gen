import java.util.*;
import java.io.*;

public class Main {
    static TreeSet<Edge> set;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        set = new TreeSet<>();
        ArrayList<City> a = new ArrayList<>();
        for (int i = 0; i < n; i++) a.add(new City(sc.nextInt(), sc.nextInt(), i));
        Collections.sort(a, (o1, o2) -> {
            if (o1.x == o2.x) return Long.compare(o1.y, o2.y);
            return Long.compare(o1.x, o2.x);
        });
        for (int i = 0; i < n - 1; i++)
            add(a.get(i).idx, a.get(i + 1).idx, Math.min(Math.abs(a.get(i).x - a.get(i + 1).x), Math.abs(a.get(i).y - a.get(i + 1).y)));
        Collections.sort(a, (o1, o2) -> {
            if (o1.y == o2.y) return Long.compare(o1.x, o2.x);
            return Long.compare(o1.y, o2.y);
        });
        for (int i = 0; i < n - 1; i++)
            add(a.get(i).idx, a.get(i + 1).idx, Math.min(Math.abs(a.get(i).x - a.get(i + 1).x), Math.abs(a.get(i).y - a.get(i + 1).y)));
        UF dsu = new UF(n);
        long mst = 0; int edges = 0;
        for (Edge e: set) {
            int one = e.a; int two = e.b;
            if (!dsu.connected(one, two)) {
                dsu.union(one, two); mst += e.w;
                ++edges;
            }
            if (edges == n - 1) break;
        }
        out.println(mst);
        out.close();
    }

    static class UF {
        private int[] parent;  // parent[i] = parent of i
        private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
        private int count;     // number of components
        private int[] size;
        public UF(int n) {
            if (n < 0) throw new IllegalArgumentException();
            count = n;
            parent = new int[n];
            rank = new byte[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
                size[i] = 1;
            }
        }

        public int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];    // path compression by halving
                p = parent[p];
            }
            return p;
        }

        public int count() {
            return count;
        }

        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;

            // make root of smaller rank point to root of larger rank
            if (rank[rootP] < rank[rootQ]) {
                parent[rootP] = rootQ;
                size[rootQ] = size[rootQ] + size[rootP];
            }
            else if (rank[rootP] > rank[rootQ]) {
                parent[rootQ] = rootP;
                size[rootP] = size[rootP] + size[rootQ];
            }
            else {
                parent[rootQ] = rootP;
                size[rootP] = size[rootP] + size[rootQ];
                rank[rootP]++;
            }
            count--;
        }
    }

    static void add(int c1, int c2, long w) {
        int min = Math.min(c1, c2);
        int max = Math.max(c1, c2);
        set.add(new Edge(min, max, w));
    }

    static class City {
        long x; long y; int idx;
        City(long x, long y, int idx) {
            this.x = x; this.y = y; this.idx = idx;
        }
    }

    static class Edge implements Comparable<Edge> {
        int a; int b; long w;
        Edge(int a, int b, long w) {
            this.a = a; this.b = b; this.w = w;
        }

        @Override
        public int compareTo(Edge o) {
            if (w == o.w) {
                if (a == o.a) return Integer.compare(b, o.b);
                else return Integer.compare(a, o.a);
            }
            return Long.compare(w, o.w);
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
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