import java.util.*;
public class Main {
    static class Node{
        List<Integer> to;
        Node(){
            to = new ArrayList<Integer>();
        }
    }
    static public class IntPair{
        int x, y;
        public IntPair(int xx, int yy){
            x = xx;
            y = yy;
        }
        @Override
        public int hashCode(){
            return Long.hashCode(((long)x << 31) + y);
        }
        @Override
        public boolean equals(Object o){
            if(!(o instanceof IntPair)){
                return false;
            }
            IntPair temp = (IntPair) o;
            return x == temp.x && y == temp.y;
        }
    }
    static Node g[];
    static int ans[];
    static Map<IntPair, Integer> mp;
    public static void dfs(int s, int p, int c){
        if(p != -1){
            ans[mp.get(new IntPair(s, p))] = c;
        }
        int now = 1;
        for(Integer x : g[s].to){
            if(x == p)continue;
            if(now == c)now++;
            dfs(x, s, now++);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        g = new Node[n];
        ans = new int[n - 1];
        mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            g[i] = new Node();
        }
        for(int i = 0; i < n - 1; i++){
            Integer a = sc.nextInt() - 1;
            Integer b = sc.nextInt() - 1;
            g[a].to.add(b);
            g[b].to.add(a);
            mp.put(new IntPair(a, b), i);
            mp.put(new IntPair(b, a), i);
        }
        dfs(0, -1, 10000000);
        int mx = -1;
        for(int i : ans){
            mx = Math.max(mx, i);
        }
        System.out.println(mx);
        for(int i : ans){
            System.out.println(i);
        }
    }
}

