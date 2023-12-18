import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(f.readLine());
        int n = Integer.parseInt (st.nextToken());
        int w = Integer.parseInt (st.nextToken());
        int[]weight=new int[n];
        int[]value=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer (f.readLine());
            weight[i]=Integer.parseInt (st.nextToken());
            value[i]=Integer.parseInt (st.nextToken());
            sum+=value[i];
        }

        long dp[][]=new long[n][sum+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=999999999999L;
            }
        }
        dp[0][0]=0;
        dp[0][value[0]]=weight[0];
        long ans=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<sum+1;j++){
                if(j==30){
                    j=j;
                }
                if(i>0)
                dp[i][j]=dp[i-1][j];
                if(j-value[i]>=0 && i>0)
                    dp[i][j]=Math.min(dp[i][j],(long)dp[i-1][j-value[i]]+(long)weight[i]);

                if(dp[i][j]<=w){
                    if(j==20){
                        j=j;
                    }
                    ans=Math.max(ans,j);
                }
            }
        }

//        for(int i=0;i<dp.length;i++){
//            System.out.println();
//            for(int j=0;j<dp[i].length;j++){
//                System.out.print(dp[i][j]+" ");
//            }
//        }

//        System.out.println();

        System.out.println(ans);



        f.close();
    }
}
