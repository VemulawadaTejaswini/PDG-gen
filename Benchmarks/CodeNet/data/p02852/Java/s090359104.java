import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9 + 7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        String a = sc.next();
        boolean[] s = new boolean[n+1];
        for(int i=0; i<n; i++){
            if(a.charAt(i) == '1'){
                s[n-i] = true;
            }
        }
        
        int[] dp = new int[n+1];
        LinkedList<String> ans = new LinkedList<>();
        for(int i=0; i<n; ){
            int next = Math.min(i+m, n);
            boolean ok = false;
            for(; next>i; next--){
                if(!s[next]){
                    dp[next] = dp[i]+1;
                    ans.addFirst(String.valueOf(next-i));
                    i = next;
                    ok = true;
                    break;
                }
            }
            
            if(!ok){
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(String.join(" ", ans));
    }
    
}