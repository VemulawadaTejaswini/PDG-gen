import java.util.*;

public class Main{
    static final int INF = (int)1e9;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        int[] value = new int[m];
        int[] keybit = new int[m];
        for(int i=0; i<m; i++){
            value[i] = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            for(int j=0; j<b; j++){
                int shift = Integer.parseInt(sc.next())-1;
                keybit[i] |= 1<<shift;
            }
        }
        
        int k = 1;
        for(int i=0; i<n; i++){
            k*=2;
        }
        
        int[] dp = new int[k];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<k; j++){
                if(dp[j]+value[i] < dp[j|keybit[i]]){
                    dp[j|keybit[i]] = dp[j]+value[i];
                }
            }
        }
        
        if(dp[k-1] != INF){
            System.out.println(dp[k-1]);
        }else{
            System.out.println(-1);
        }
    }
}
