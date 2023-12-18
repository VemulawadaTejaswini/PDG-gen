import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s");
        long N = Long.parseLong(s[0]);
        long W = Long.parseLong(s[1]);
        long[][] ws = new long[(int)N][2];
        for(int i=0;i<N;++i){
            s = br.readLine().split("\\s");
            ws[i][0] = Long.parseLong(s[0]);
            ws[i][1] = Long.parseLong(s[1]);
        }
        
        long[][] dp = new long[(int)N+1][(int)W+1];
        long max_val = 0,minw = ws[0][0];
        
        for(int i=0;i<ws.length;++i) minw = Math.min(minw,ws[i][0]);
        
        for(int i=0;i<N;++i){
            for(long j=minw;j<=W;++j){
                if(j - ws[i][0] >= 0) dp[i+1][(int)j] = dp[i][(int)(j-ws[i][0])] + ws[i][1];
                else dp[i+1][(int)j] = dp[i][(int)j];
                max_val = Math.max(max_val,dp[i+1][(int)j]);
            }
        }
        
        System.out.println(max_val);
    }    
}
