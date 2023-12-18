
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String arg[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        char arr[][]=new char[n][m];
        for(int i=0;i<n;i++)
            arr[i]=in.readLine().toCharArray();
        long dp[][]=new long[n][m];
        long mod=1000000007;
        for(int i=0;i<n;i++)
            if(arr[i][0]=='.')
                dp[i][0]=1;
            else
                break;
        for(int j=0;j<m;j++)
            if(arr[0][j]=='.')
                dp[0][j]=1;
            else
                break;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]=='.')
                    dp[i][j]=(dp[i-1][j]+dp[i][j-1])%mod;
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}
