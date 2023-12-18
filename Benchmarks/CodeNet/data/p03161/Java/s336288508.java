import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]po=new int[n];
        for(int i=0;i<n;i++)po[i]=sc.nextInt();
        int[]dp=new int[n+1];
        //dp[1]=Math.abs(po[1]-po[0]);
        for(int i=1;i<n;i++){
            for(int j=Math.max(0,i-k);j<i;j++){
                if(j==Math.max(0,i-k)){
                    dp[i]=dp[j]+Math.abs(po[i]-po[j]);
                }
                else dp[i]=Math.min(dp[i],dp[j]+Math.abs(po[i]-po[j]));
            }
        }
        //for(int i=0;i<=n;i++)System.out.println(dp[i]);
        System.out.println(dp[n-1]);
    }
}
