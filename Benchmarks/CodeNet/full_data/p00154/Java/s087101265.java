import java.lang.*;
import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        while(true){
            int m = sc.nextInt();
            if(m == 0) break;
            
            int[] v = new int[m+1];
            int[] n = new int[m+1];
            for(int i=0; i<m;i++){
                v[i] = sc.nextInt();
                n[i] = sc.nextInt();
            }
            
            int[] dp = new int[1001];
            dp[0] = 1;
            
            for(int i=0; i<m; i++){
                for(int j=1000; j>=0; j--){
                    for(int k=1; k<=n[i]; k++){
                        if(j + k*v[i] <= 1000) dp[j + k*v[i]] += dp[j];
                    }
                }
            }
            int c = sc.nextInt();
            for(int i=0; i<c; i++){
                System.out.println(dp[sc.nextInt()]);         
            }
        }
    }
    
}