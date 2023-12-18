import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int h[] = new int[N];
        for(int i=0;i<N;i++){
            h[i] = in.nextInt();
        }
        in.close();
        int dp[] = new int[N];
        for(int i=0;i<N;i++){
            if(i==0){
                dp[i] = 0;
            }
            else{
                dp[i] = 1000010;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<Math.min(K+1,N-i);j++){
                if (dp[i+j] >= dp[i]+Math.abs(h[i+j]-h[i])){
                    dp[i+j] = Math.min(dp[i]+Math.abs(h[i+j]-h[i]),dp[i+j]);
                }
            }
        }
        System.out.println(dp[N-1]);
    }
}