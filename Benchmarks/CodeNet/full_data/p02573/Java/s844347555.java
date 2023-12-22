import java.io.*;
import java.util.*;

public class Main {
    static List<HashSet<Integer>> adjSet;
    static int[] vis;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        adjSet = new ArrayList<HashSet<Integer>>();
        vis = new int[N];
        for(int i = 0; i < N; ++i){
            adjSet.add(new HashSet<Integer>());
        }
        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            adjSet.get(a).add(b);
            adjSet.get(b).add(a);
        }
        int mx = 0;
        for(int i = 0; i < N; ++i){
            if(vis[i] == 0){
                int got = dfs(i, -1);
                mx = Math.max(mx, got);
            }
        }
        System.out.println(mx);
    }
    
    static int dfs(int start, int parent){
        vis[start] = 1;
        int tot = 1;
        for(int nbr : adjSet.get(start)){
            if(nbr != parent && vis[nbr] == 0)
                tot += dfs(nbr, start);
        }
        return tot;
    }
}