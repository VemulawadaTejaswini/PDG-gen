import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int a[] = new int[N-1];
        int b[] = new int[N-1];
        int c[] = new int[N-1];
        int d[] = new int[N-1];
        ArrayList[] links = new ArrayList[N];
        ArrayList<Integer> parents_list[] = new ArrayList[N];
        for (int i=0;i<N;i++) {
            links[i] = new ArrayList<Link>();
            parents_list[i] = new ArrayList<Integer>();
        }

        for (int i=0;i<N-1;i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            c[i] = sc.nextInt() - 1;
            d[i] = sc.nextInt();
            links[a[i]].add(new Link(a[i], b[i], c[i], d[i]));
            links[b[i]].add(new Link(b[i], a[i], c[i], d[i]));
        }

        long distance[][] = new long[N][N];
        long num[][] = new long[N][N];
        long total_distance[] = new long[N];

        calc_distance(0, -1, num, distance, total_distance, links, parents_list);
//        for (int i=0;i<N;i++) {
//            for (int j=0;j<N;j++) {
//                out.printf("%5d ", distance[i][j]);
//            }
//            out.println();
//        }
//
//        out.println();
//        for (int i=0;i<N;i++) {
//            out.printf("%5d ", total_distance[i]);
//            out.println();
//        }
//
//        for (int i=0;i<N;i++) {
//            for (int j=0;j<N;j++) {
//                out.printf("%5d ", num[i][j]);
//            }
//            out.println();
//        }

        for (int i=0;i<Q;i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt();
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;

            int p = 0;
            if (u != 0 && v != 0) p = same_parent(u, v, parents_list);

            long ans = total_distance[u] + total_distance[v] - total_distance[p] * 2;
            ans -= distance[u][x] + distance[v][x] - distance[p][x] * 2;
            ans += (num[u][x] + num[v][x] - num[p][x] * 2) * y;
            out.println(ans);
        }

        out.flush();
    }

    public static void calc_distance(int now, int parent, long num[][], long distance[][], long total_distance[],
            ArrayList<Link> links[], ArrayList<Integer> parents_list[]) {
        for (Link l: links[now]) {
            if (l.to == parent) continue;

            distance[l.to] = distance[now].clone();
            distance[l.to][l.color] += l.distance;
            num[l.to] = num[now].clone();
            num[l.to][l.color]++;
            total_distance[l.to] = total_distance[now] + l.distance;

            parents_list[l.to] = (ArrayList<Integer>) parents_list[now].clone();
            parents_list[l.to].add(now);

            calc_distance(l.to, now, num, distance, total_distance, links, parents_list);
        }
    }

    /*
5 3
1 2 1 10
1 3 2 20
2 4 4 30
5 2 1 40
1 100  4 5
     */
    public static int same_parent(int a, int b, ArrayList<Integer> parents_list[]) {
        int l = 0;
        int ret = 0;
        int r = Math.min(parents_list[a].size(), parents_list[b].size()) - 1;

        while (true) {
            int mid = (l + r) / 2;
            if (parents_list[a].get(mid) != parents_list[b].get(mid)) {
                r = mid - 1;
            } else {
                ret = mid;
                l = mid + 1;
            }

            if (l > r) {
                break;
            }
        }

        return ret;
    }

    public static class Link {
        int from, to, color, distance;
        Link(int from, int to, int color, int distance) {
            this.from = from;
            this.to = to;
            this.color = color;
            this.distance = distance;
        }
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