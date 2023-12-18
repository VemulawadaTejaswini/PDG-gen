import java.util.*;
import java.io.*;

public class Main {

    static class Town implements Comparable<Town>{
        int dist;
        int i;

        public Town(int i){
            dist = Integer.MAX_VALUE;
            this.i = i;
        }

        public int compareTo(Town t){
            return this.dist - t.dist;
        }
    }

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("Main.out");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[][] adj = new int[n+1][n+1];
        int[][] minDist = new int[n+1][n+1];
        Town[] list = new Town[n+1];

        for(int i = 1; i<=n; i++){
            list[i] = new Town(i);
        }


        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int ai = Integer.parseInt(st.nextToken());
            int bi = Integer.parseInt(st.nextToken());
            int ci = Integer.parseInt(st.nextToken());
            adj[ai][bi] = ci;
            adj[bi][ai] = ci;
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=n; i++){
            Town source = list[i];
            boolean[] visited = new boolean[n+1];
            source.dist = 0;
            PriorityQueue<Town> pq = new PriorityQueue<Town>();
            pq.add(source);

            while(!pq.isEmpty()){
                Town s = pq.poll();
                visited[s.i] = true;
                for(int j = 1; j<=n; j++){
                    if(adj[s.i][j] > 0 && !visited[j]){
                        if(s.dist + adj[s.i][j] < list[j].dist){
                            list[j].dist = s.dist + adj[s.i][j];
                            pq.add(list[j]);
                        }
                    }
                }
            }
            for(int j = 1; j <= n; j++){
                minDist[i][j] = list[j].dist;
                list[j].dist = Integer.MAX_VALUE;
            }
        }

        int q = Integer.parseInt(st.nextToken());
        for(int i = 0; i<q; i++){
            st = new StringTokenizer(br.readLine());
            int s1 = Integer.parseInt(st.nextToken());
            int t1 = Integer.parseInt(st.nextToken());

            if(minDist[s1][t1] != Integer.MAX_VALUE){
                System.out.println(minDist[s1][t1] / l);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}