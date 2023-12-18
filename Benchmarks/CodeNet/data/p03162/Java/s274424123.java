//package AtCoderDp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        int c[]=new int[n+1];
        for(int i=1;i<=n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            a[i]=Integer.parseInt(st.nextToken());
            b[i]=Integer.parseInt(st.nextToken());
            c[i]=Integer.parseInt(st.nextToken());
        }
        int dp[][]=new int[n+1][4];
        dp[n][1]=a[n];
        dp[n][2]=b[n];
        dp[n][3]=c[n];
        for(int i=n-1;i>=1;i--){
            dp[i][1]=Math.max(dp[i+1][2],dp[i+1][3])+a[i];
            dp[i][2]=Math.max(dp[i+1][1],dp[i+1][3])+b[i];
            dp[i][3]=Math.max(dp[i+1][1],dp[i+1][2])+c[i];
        }
        System.out.println(Math.max(dp[1][1],Math.max(dp[1][2],dp[1][3])));
    }
}
