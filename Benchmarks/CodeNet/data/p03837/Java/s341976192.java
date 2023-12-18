import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {
        int N = nextInt();
        int M = nextInt();
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<Edge>[] edges = new ArrayList[N+1];
        for(int i = 0; i <= N; ++i) edges[i] = new ArrayList<>();

        for(int m = 0; m < M; ++m) {
            int a = nextInt();
            int b = nextInt();
            int c = nextInt();
            edges[a].add(new Edge(b,c));
            edges[b].add(new Edge(a,c));
            int min = Math.min(a,b);
            int max = Math.max(a,b);
            String s = min+","+max;
            if(!hm.containsKey(s)) {
                hm.put(s,0);
            }
        }
        for(int v1 = 1; v1 <= N; ++v1) {
            for(int v2 = v1 + 1; v2 <= N; ++v2) {
                PriorityQueue<Edge> pq = new PriorityQueue<>();
                pq.offer(new Edge(v1,0));
                int[] p = new int[N+1];
                p[v1] = v1;
                int[] dist = new int[N+1];
                Arrays.fill(dist,(1 << 29));
                dist[v1] = 0;
                boolean[] used = new boolean[N+1];
                while(!pq.isEmpty()) {
                    Edge top = pq.poll();
                    if(top.to == v2) break;
                    if(used[top.to]) continue;
                    used[top.to] = true;
                    for(Edge to : edges[top.to]) {
                        if(dist[to.to] > top.w + to.w) {
                            dist[to.to] = top.w + to.w;
                            p[to.to] = top.to;
                            pq.offer(new Edge(to.to,dist[to.to]));
                        }
                    }
                }
                int end = v2;
                while(end != v1) {
                    int parent = p[end];
                    int current = end;
                    int min = Math.min(parent, current);
                    int max = Math.max(parent, current);
                    String s = min+","+max;
                    if(!hm.containsKey(s)) {
                        hm.put(s,1);
                    } else {
                        hm.put(s,hm.get(s)+1);
                    }
                    end = parent;
                }
            }
        }
        int ret = 0;
        for(String s : hm.keySet()) {
            if(hm.get(s) == 0) ++ret;
        }
        writer.println(ret);



    }

    static class Edge implements Comparable<Edge> {
        int to;
        int w;

        public Edge(int _to,int _w) {
            to = _to;
            w = _w;
        }

        @Override
        public int compareTo(Edge o) {
            return this.w - o.w;
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("highcard.in"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("highcard.out");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}