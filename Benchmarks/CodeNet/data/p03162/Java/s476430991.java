import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{	
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt();
        int[][] act=new int[n+1][3];
        int[][] dp=new int[n+1][3]; 
        for(int i=1;i<=n;i++){
            act[i][0]=s.nextInt();act[i][1]=s.nextInt();act[i][2]=s.nextInt();
        }
        for(int i=1;i<=n;i++){
                dp[i][0]=Math.max(dp[i][0],dp[i-1][1]+act[i][0]);
                dp[i][0]=Math.max(dp[i][0],dp[i-1][2]+act[i][0]);
                dp[i][1]=Math.max(dp[i][1],dp[i-1][0]+act[i][1]);
                dp[i][1]=Math.max(dp[i][1],dp[i-1][2]+act[i][1]);
                dp[i][2]=Math.max(dp[i][2],dp[i-1][0]+act[i][2]);
                dp[i][2]=Math.max(dp[i][2],dp[i-1][1]+act[i][2]);
        }

        System.out.println(Math.max(dp[n][0],Math.max(dp[n][1],dp[n][2])));
    }
}