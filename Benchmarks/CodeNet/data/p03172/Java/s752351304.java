import java.util.*;
import java.io.*;

public class Main {
    static final long MOD=1000000007;
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(f.readLine());
        int n = Integer.parseInt (st.nextToken());
        int k = Integer.parseInt (st.nextToken());
        int[]arr=new int[n];
        st=new StringTokenizer(f.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        long[][]dp=new long[n+5][k+5];
        long[][]prefix=new long[n+5][k+5];
        for(int i=0;i<=k && i<=arr[0];i++){
            dp[0][i]=1;
            prefix[0][i]=1;
        }
        for(int i=1;i<=k;i++){
            prefix[0][i]+=prefix[0][i-1];
            prefix[0][i]%=MOD;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=k;j++){
                //j candies, give
                //give all to the last or all-a[i];
                long a=j-arr[i]-1>=0?prefix[i-1][j-arr[i]-1]:0;
                dp[i][j]=prefix[i-1][j]-a;
                if(dp[i][j]<0)dp[i][j]+=MOD;
                dp[i][j]%=MOD;
                prefix[i][j]=dp[i][j];
                if(j!=0)prefix[i][j]+=prefix[i][j-1];
                prefix[i][j]%=MOD;
            }
        }
        System.out.println(dp[n-1][k]);
        f.close();

        //print to System. out.println

    }

}
