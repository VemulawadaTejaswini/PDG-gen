/*
    It is the level of one's commitment that determines the success, far more than the knowledge one possess.
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1 ; i<=n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n+2];
        for(int i=2 ; i<=n ; i++) {
            dp[i] = Math.min(dp[i-1]+Math.abs(a[i]-a[i-1]), dp[i-2]+Math.abs(a[i]-a[i-2]));
        }

        pw.println(dp[n]);

        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
