

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            map.put(i, new HashSet<Integer>());
        }

        for(int i=0; i<m; i++){
            StringTokenizer pair = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(pair.nextToken());
            int v2 = Integer.parseInt(pair.nextToken());

            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }

        int max = 0;
        boolean[] vis = new boolean[n+1];

        for(int i=1; i<=n; i++){
            if(!vis[i]){
                max = Math.max(max, dfs(i, vis, map));
            }
        }

        System.out.println(max);
    }

    static int dfs(int i, boolean[] vis, HashMap<Integer, Set<Integer>> map){
        vis[i] = true;
        int size = 1;

        Set<Integer> fr = map.get(i);
        
        for(int next: fr){
            if(!vis[next]){
                size += dfs(next, vis, map);
            }
        }

        return size;
    }
}
