import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e5+5;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(s[i]+"");
        }
        
        //n+1あとで2にする
        int[][] dp = new int[n+1][p];
        long ans = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<p; j++){
                dp[i+1][(j*10+a[i])%p] += dp[i][j];
            }
            
            dp[i+1][a[i]%p] += 1;
            
            /*
            for(int k=0; k<p; k++){
                System.out.print(dp[i+1][k] + "  ");
            }
            System.out.println();
            */
            
            ans += dp[i+1][0];
        }
        
        System.out.println(ans);
    }
    
}
