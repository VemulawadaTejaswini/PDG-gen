/*
    It is the level of one's commitment that determines the success, far more than the knowledge one possess.
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.IllegalCharsetNameException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] a = new int[n+1];
        for(int i=1 ; i<=n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n+1];

        for(int i=2 ; i<=n ; i++) dp[i] = Integer.MAX_VALUE-1000000000;

        for(int i=2 ; i<=n ; i++) {
            for(int j=i-1 ; j>=i-k && j>=1 ; j--) {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(a[i]-a[j]));
            }
        }

        pw.println(dp[n]);
        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
