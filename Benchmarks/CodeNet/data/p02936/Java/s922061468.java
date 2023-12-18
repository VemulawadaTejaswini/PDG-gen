import java.util.*;

public class Main{
    static final int INF = (int)1e9;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        ArrayList<Integer>[] ch = new ArrayList[n];
        for(int i=0; i<n; i++){
            ch[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n-1; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            ch[a].add(b);
            ch[b].add(a);
        }
        
        long[] ans = new long[n];
        for(int i=0; i<m; i++){
            int p = Integer.parseInt(sc.next())-1;
            int x = Integer.parseInt(sc.next());
            ans[p] += x;
        }
        
        boolean[] used = new boolean[n];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offerFirst(0);
        used[0] = true;
        while(q.size()!=0){
            int now = q.removeLast();
            for(int next : ch[now]){
                if(!used[next]){
                    ans[next] += ans[now];
                    q.offerFirst(next);
                    used[next] = true;
                }
            }
        }
        
        System.out.print(ans[0]);
        for(int i=1; i<n; i++){
            System.out.print(" " + ans[i]);
        }
        System.out.println("");
    }
}
