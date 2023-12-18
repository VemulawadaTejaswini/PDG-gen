import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class MCandies {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int k = in.nextInt();
        int [][] dp = new int[n+1][k+1];
        int []ai = new int[n+1];
        int mod = (int)1e9+7;
        dp[0][0]=1;
        for(int i=1;i<=n;i++)
            ai[i] = in.nextInt();
        for(int i=1;i<=n;i++){
            int []psum = new int[k+2];
            int cur =0;
            for(int idex=0;idex<=k;idex++){
                cur= (cur + dp[i-1][idex])%mod;
                psum[idex+1]=cur%mod;
            }
            for(int j=0;j<=k;j++){
                int mx = Math.min(ai[i],j);
                int a= psum[j+1];
                int b = psum[(j-mx)];
                if (a<b)
                    a+=mod;
                dp[i][j] = (a-b)%mod;
            }
        }
        System.out.println(dp[n][k]%mod);


    }
}
