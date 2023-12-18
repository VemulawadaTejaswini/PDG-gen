import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int bag=sc.nextInt()*2;
        int n=sc.nextInt();
        int dp[][]=new int[n+1][bag+1];
        int sh[]=new int[n+1];
        int xs[]=new int[n+1];
        for(int i=1;i<=n;i++){
            sh[i]=sc.nextInt();
            xs[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=bag;j++){
                int c=j/sh[i];
                if(i==1){
                    if(j%sh[i]!=0)
                        c++;
                }
                if(dp[i][j]==0) {
                    if(i==1)
                        dp[i][j] = c * xs[i];
                    else
                        dp[i][j]=dp[i-1][j];
                }
                else
                    dp[i][j]=Math.min(dp[i][j],dp[i][j-c*sh[i]]+c*xs[i]);
            }
        }
        int min=dp[n][bag/2];
        for(int i=bag/2+1;i<=bag;i++)
            min=Math.min(min,dp[n][i]);
        System.out.println(min);
    }
}