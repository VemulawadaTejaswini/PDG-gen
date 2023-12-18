import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long dp[]=new long[100001];
        for(int i=1;i<dp.length;i++)dp[i]=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int j=100000;j>=b;j--){
                if(dp[j-b]!=Long.MAX_VALUE){
                    dp[j]=Math.min(dp[j],dp[j-b]+a);
                }
            }
        }
        for(int i=100000;i>=0;i--){
            if(dp[i]<=k){
                System.out.println(i);
                break;
            }
        }
        
    }
}
