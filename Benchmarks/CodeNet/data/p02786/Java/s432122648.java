/*
    Those who cannot remember the past are condemned to repeat it.
                                            - Dynamic Programming
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        long n = Long.parseLong(br.readLine());

        HashMap<Long, Long> dp = new HashMap<>();

        dp.put(1l, 1l);

        long ans = getAns(dp, n);

        pw.println(ans);

        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }

    static long getAns(HashMap<Long, Long> dp, long n) {
        if(dp.containsKey(n)) {
            return dp.get(n);
        }
        long ans = getAns(dp, n/2);
        ans += ans;
        ans++;
        return ans;
    }
}
