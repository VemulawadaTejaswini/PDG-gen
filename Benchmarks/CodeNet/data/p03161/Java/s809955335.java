import java.util.*;

public class Main {
    public static final long INF = Long.MAX_VALUE >> 2;
    public static long[] dp = new long[100010];
    public static void main(String[] args) throws Exception {
    for(int i=0;i<100010;++i)dp[i] = INF;
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int K = sc.nextInt();
       long[] steps = new long[N + 10];
       for(int i=0;i<N;i++){
           steps[i] = sc.nextLong();
       }
       //最初に考えたやり方
    //   for(int i=0;i<N;i++){
    //       if(i == 0){
    //           dp[i] = 0;
    //       }else if(i == 1){
    //           dp[i] = height(steps[0],steps[1]);
    //       }else{
    //           if(K == 1){
    //               dp[i] = dp[i - 1] + height(steps[i],steps[i-1]);
    //           }else{
    //             for(int j=1;j<=i && j<=K;j++){
    //             dp[i] = chmin(dp[i] ,dp[i-j] + height(steps[i],steps[i-j]));
    //             }
    //           }
    //       }
    //   }
    
     //こっちの方が記述しやすい
     for(int i=0;i<N;i++){
         if(i == 0){
             dp[i] = 0;
         }else{
            for(int j=1;j<=i && j<=K;j++){
                dp[i] = chmin(dp[i],(dp[i-j] + height(steps[i],steps[i-j])));
            }
         }
     }
       System.out.println(dp[N - 1]);
    }
    
    public static long height(long h1,long h2){
        return Math.abs(h1 - h2);
    }
    
    public static long chmin(long a , long b){
        return Math.min(a,b);
    }
}
