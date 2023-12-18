
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine());
        int n=Integer.parseInt(st.nextToken());
        int W= Integer.parseInt(st.nextToken());
        int w[]=new int[n+1];
        int v[]=new int[n+1];
        for(int i=1;i<=n;i++){
            st=new StringTokenizer(in.readLine()," ");
            w[i]=Integer.parseInt(st.nextToken());
            v[i]=Integer.parseInt(st.nextToken());
        }
        long dp[][]=new long[n+1][W+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(j<w[i])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=Math.max(dp[i-1][j],v[i]+dp[i-1][j-w[i]]);
            }
        }
        System.out.println(dp[n][W]);
    }
}
