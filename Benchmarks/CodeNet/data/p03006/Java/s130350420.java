import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        for (int i=0;i<N;i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = 50;

        for (int i=0;i<N;i++) {
            for (int j=i+1;j<N;j++) {
                int pq[] = calc_pq(x[i], y[i], x[j], y[j]);

                UnionFind uf = new UnionFind(N);

                for (int k=0;k<N;k++) {
                    for (int l=k+1;l<N;l++) {
                        if (check(x[k], y[k], x[l], y[l], pq[0], pq[1]) == false) continue;

                        uf.union(k, l);
                    }
                }

                int cost = 0;
                int groups[] = new int[N];
                for (int k=0;k<N;k++) {
                    int g = uf.find(k);
                    if (groups[g] == 0) {
                        cost++;
                        groups[g] = 1;
                    }
                }

                ans = Math.min(ans, cost);
            }
        }

        out.println(ans);
        out.flush();
    }

    public static int[] calc_pq(int x1, int y1, int x2, int y2) {
        return new int[] { x2 - x1, y2 - y1 };
    }

    public static boolean check(int x1, int y1, int x2, int y2, int p, int q) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        if (p != 0) {
            if (dx % p == 0) {
                if (y2 == y1 + (dx / p) * q) {
                    return true;
                }
            }
        } else {
            if (dx == 0) {
                if (dy % q == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
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
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }

        int[] nextIntArray(int N) {
            int a[] = new int[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextInt();
            }

            return a;
        }

        long[] nextLongArray(int N) {
            long a[] = new long[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextLong();
            }

            return a;
        }

        double[] nextDoubleArray(int N) {
            double a[] = new double[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextDouble();
            }

            return a;
        }

        String[] nextTokenArray(int N) {
            String a[] = new String[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextToken();
            }

            return a;
        }
    }
}

class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int size) {
        this.parent = new int[size];
        this.rank = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0;
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;

        } else if(rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;

        } else if (xRoot != yRoot){
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }

    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}