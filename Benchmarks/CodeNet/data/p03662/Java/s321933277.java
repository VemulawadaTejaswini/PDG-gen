import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;
    public static int MOD = 1000000007;

    public static int N;

    public static int[] dist1, dist2;
    public static boolean[] vis;


    public static void dfs(int u, int d, int col){
        for(int v : adjList.get(u)){
            if(vis[v]) continue;
            vis[v] = true;
            if(col == 0){
                dist1[v] = d + 1;
            } else{
                dist2[v] = d + 1;
            }
            dfs(v, d+1, col);
        }
    }


    public static void main(String[] args) throws Exception{
        N = Integer.parseInt(br.readLine());
        adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < N; i++){
            adjList.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < N - 1; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        dist1 = new int[N];
        dist2 = new int[N];

        vis = new boolean[N];
        vis[0] = true;
        dfs(0, 0, 0);

        vis = new boolean[N];
        vis[N-1] = true;
        dfs(N-1, 0, 1);

        int a = 0;
        int b = 0;
        for(int i = 0; i < N; i++){
            if(dist1[i] <= dist2[i]){
                a++;
            } else if(dist1[i] > dist2[i]){
                b++;
            }
        }
        pw.print(a > b ? "Fennec\n" : "Snuke\n");


        pw.close(); 
        br.close();
    }
}

class Pair {
    public int a;
    public long b;

    Pair(int a, long b){
        this.a = a;
        this.b = b;
    }

}