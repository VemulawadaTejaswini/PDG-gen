import java.util.*;
import java.io.*;
public class Main {
    void solve(BufferedReader in) throws Exception {
        String ss = in.readLine();
        int n = ss.length();
        int[] s = new int[n];
        for(int i = 0; i<n; i++) s[i] = ss.charAt(i) - 'a';
        int[][] dp = new int[26][n];
        dp[s[0]][0] = 1;
        for(int i = 1; i<n; i++) {
            for(int c = 0; c<26; c++) dp[c][i] = dp[c][i-1];
            dp[s[i]][i]++;
        }
        int[] sum = new int[26];
        for(int i = 0; i<26; i++) sum[i] = dp[i][n-1];
        int f = 0;
        for(int i = 0; i<n; i++) {
            f += sum[s[i]] - dp[s[i]][i] + 1;
        }
        System.out.println(n*(n+1)/2 + 1 - f);
    }
    int toInt(String s) {return Integer.parseInt(s);}
    int[] toInts(String s) {
        String[] a = s.split(" ");
        int[] o = new int[a.length];
        for(int i = 0; i<a.length; i++) o[i] = toInt(a[i]);
        return o;
    }
    void e(Object o) {
        System.err.println(o);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        (new Main()).solve(in);
    }
}
