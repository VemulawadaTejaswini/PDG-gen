import java.util.*;
import java.io.*;

public class Main {
    public static long MOD = 1000000007;
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long ans = 0;
        long lsum = 0;
        long rsum = 0;
        for(int i = 0; i < k; i++){
            lsum+=i;
            rsum+=(n-i);
            lsum%=MOD;
            rsum%=MOD;
        }
        for(int i = k; i <= n+1; i++){
            ans+=((((rsum-lsum+1)%MOD)+MOD)%MOD);
            ans%=MOD;
            lsum+=i;
            lsum%=MOD;
            rsum+=(n-i);
            rsum%=MOD;
        }
        out.println(ans);


        out.close();
    }

}
