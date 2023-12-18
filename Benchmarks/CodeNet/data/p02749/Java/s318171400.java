import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    static int n;
    static ArrayList<Integer>[] g;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n-1; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            g[a].add(b);
            g[b].add(a);
        }
        
        //3始まり
        int[] ans1 = new int[n];
        dfs(ans1, 0, 3,2,1);
        //1か2始まり
        int[] ans2 = new int[n];
        dfs(ans2, 0, 2,1,3);
        
        /*
        for(int i=0; i<n; i++){
            System.out.print(ans1[i] + "  ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(ans2[i] + "  ");
        }
        System.out.println();
        */
        
        int[] cnt = new int[3];
        for(int i=0; i<n; i++){
            cnt[ans1[i]-1]++;
        }
        
        if(cnt[0] < cnt[2] || cnt[1] < cnt[2]){
            ans1 = ans2;
            Arrays.fill(cnt, 0);
            for(int i=0; i<n; i++){
                cnt[ans1[i]-1]++;
            }
        }
        
        boolean rev = cnt[0] < cnt[1];
        
        int[] ans = new int[n];
        int[] used = new int[3];
        for(int i=0; i<n; i++){
            if(used[ans1[i]-1] < (n+2)/3 && ans1[i] <= n%3){
                int num = used[ans1[i]-1] * 3;
                int tmp = ans1[i];
                if(rev){
                    tmp = ((tmp-1)^1)+1;
                }
                ans[i] = num+tmp;
                used[ans1[i]-1]++;
            }else{
                ans[i] = used[2] * 3 + 3;
                used[2]++;
            }
        }
        
        StringJoiner sj = new StringJoiner(" ");
        for(int i=0; i<n; i++){
            sj.add("" + ans[i]);
        }
        
        System.out.println(sj.toString());
    }
    
    public static void dfs(int[] ans, int nowidx, int prev3, int prev2, int prev1){
        int num;
        if(prev3==2){
            num = 1;
        }else if(prev3==1){
            num = 2;
        }else{
            num = 3;
        }
        
        ans[nowidx] = num;
        for(int next : g[nowidx]){
            if(ans[next]==0){
                dfs(ans, next, prev2, prev1, num);
            }
        }
    }
    
}
