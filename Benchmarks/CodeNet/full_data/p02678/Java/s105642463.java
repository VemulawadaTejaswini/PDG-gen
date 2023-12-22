import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean found = false;
    static Map<Integer,Integer> dp =new HashMap<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for(int i=1; i<=n; ++i) mp.putIfAbsent(i, new ArrayList<>());
        for(int i=1; i<=m; ++i){
            s = br.readLine().split(" ");
            int u = Integer.parseInt(s[0]);
            int v = Integer.parseInt(s[1]);
            mp.get(u).add(v);
            mp.get(v).add(u);
        }
        //System.out.println(mp.toString());
        for(int i=2; i<=n; ++i){
            //System.out.println(dp.toString());
            bfs(i,mp,new HashSet<Integer>());
        }
        if(found) System.out.println("Yes");
        if(!found) {
            System.out.println("No");
            return;
        }
        for(int i=2; i<=n; ++i){
            if(dp.containsKey(i))
                System.out.println(dp.get(i));
        }
    }
    public static void bfs(int u, Map<Integer,List<Integer>> mp , Set<Integer> set){
        Queue<int[]> q = new LinkedList<>();
        //q.add(new int[]{u,-1,0});
        for(int  v : mp.getOrDefault(u, new ArrayList<>())){
            if(v == 1){
                dp.put(u,v);
                return;
            }
            q.add(new int[]{v,v,1});
        }
        while(!q.isEmpty()){
            int[] curr =q.poll();
            int u1 = curr[0];
            int sign = curr[1];
            int dist = curr[2];
            if(u1 == 1){
                found = true;
                dp.put(u,sign);
                break;
            }
            set.add(u1);
            for(int v : mp.getOrDefault(u1,new ArrayList<>())){
                if(!set.contains(v)){
                    q.add(new int[]{v,sign,dist+1});
                }
            }
        }
    }
}