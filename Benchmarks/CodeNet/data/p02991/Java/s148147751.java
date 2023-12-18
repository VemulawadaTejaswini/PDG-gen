import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, List<Integer>> _all_edges = new HashMap<Integer, List<Integer>>();
        Map<Integer, List<Integer>> _all_edges_rev = new HashMap<Integer, List<Integer>>();
        Map<Integer, List<Integer>> all_edges_2 = new HashMap<Integer, List<Integer>>();
        Map<Integer, List<Integer>> all_edges_2_rev = new HashMap<Integer, List<Integer>>();
        for (int i=0;i<N;i++) {
            _all_edges.put(i, new ArrayList<Integer>());
            _all_edges_rev.put(i, new ArrayList<Integer>());

            all_edges_2.put(i, new ArrayList<Integer>());
            all_edges_2_rev.put(i, new ArrayList<Integer>());
        }

        for (int i=0;i<M;i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            _all_edges.get(u).add(v);
            _all_edges_rev.get(v).add(u);
        }

        for (int i=0;i<N;i++) {
            all_edges_2.put(i, dep3(_all_edges, i));
            all_edges_2_rev.put(i, dep3(_all_edges_rev, i));
        }

        int S = sc.nextInt();
        int T = sc.nextInt();

        int distance = search(all_edges_2, all_edges_2_rev, S-1, T-1, N);
        int ans = -1;

        if (distance > 0) {
            ans = distance;
        }

        out.println(ans);
        out.flush();
    }

    public static int search(Map<Integer, List<Integer>> all_edges, Map<Integer, List<Integer>> all_edges_rev, int start, int end, int max_node_number) {
        boolean is[][] = new boolean[2][max_node_number];
        ArrayList<Integer> now[] = new ArrayList[2];
        now[0] = new ArrayList<Integer>();
        now[1] = new ArrayList<Integer>();
        now[0].add(start);
        now[1].add(end);
        is[0][start] = true;
        is[1][end] = true;

        int ans = 0;

        while (true) {
//            System.out.println("--");
//            System.out.println(now[0]);
//            System.out.println(now[1]);

            if (now[0].size() == 0 || now[1].size() == 0) {
                ans = -1;
                break;
            }

            int n = now[0].size() < now[1].size() ? 0 : 1;
            ans++;

            ArrayList<Integer> next = new ArrayList<Integer>();
            for (int s: now[n]) {
                next.addAll((n == 0 ? all_edges : all_edges_rev).get(s));
            }
            next = new ArrayList<Integer>(new HashSet<>(next));

            ArrayList<Integer> next2 = new ArrayList<Integer>();
            boolean is_ok = false;
            for (int i: next) {
                if (is[n][i] == false) {
                    next2.add(i);
                }
                is[n][i] = true;
                if (is[1-n][i]) {
                    is_ok = true;
                }
            }

            if (is_ok) {
                break;
            }

            now[n] = next2;
        }

        return ans;
    }

    public static ArrayList<Integer> dep3(Map<Integer, List<Integer>> all_edges, int start) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(start);

        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i=0;i<3;i++) {
            for (int s: a) {
                b.addAll(all_edges.get(s));
            }

            a = new ArrayList<Integer>(new HashSet<>(b));
            b.clear();
        }

        return a;
    }


    public static int dijkstra(Map<Integer, List<int[]>> all_edges, int start, int end, int max_node_number) {
        int[] distance = new int[max_node_number+1];
        for(int i=0;i<distance.length;i++) distance[i] = -1;
        PriorityQueue<int[]> p_que = new PriorityQueue<>((a,b)->((distance[a[0]])-(distance[b[0]])));
        distance[start] = 0;
        List<int[]> edges = all_edges.get(start);
        for(int i=0;i<edges.size();i++) p_que.add(edges.get(i));
        while(p_que.isEmpty() == false) {
            int[] nearest_edge = p_que.poll();
            if (nearest_edge == null) continue;

            if(distance[nearest_edge[1]]<0) {
                distance[nearest_edge[1]] = distance[nearest_edge[0]] + 1;
                if(all_edges.containsKey(nearest_edge[1])) {
                    edges = all_edges.get(nearest_edge[1]);
                    for(int i=0;i<edges.size();i++) {
                        int[] edge = edges.get(i);
                        if(distance[edge[1]]<0) p_que.add(edge);
                    }
                }
            }
        }

        return distance[end];
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