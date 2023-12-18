import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
       int N = sc.nextInt();
       int K = sc.nextInt();
       int[] h = new int[N];
       for(int i = 0; i < N; i++){
           h[i] = sc.nextInt();
       }
       Arrays.sort(h);
       int[] dp = new int[N];
       dp[0] = 0;
       for(int i = 0; i < N-1; i++){
           dp[i+1] = dp[i] + (h[i+1] - h[i]); 
       }
       int min = dp[K-1] - dp[0];
       for(int i = 0; i < N-K+1; i++){
           if(min > (dp[K-1+i] - dp[i]))
            min = dp[K-1+i] - dp[i];
       }
       System.out.println(min);
    }
}
