import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int s[] = new int[3001];
        int t[] = new int[3001];
        int sc = setArray(s);
        int tc = setArray(t);

        int dp[][] = new int[3001][3001];
        for (int i = 0; i < sc; i++) {
            for (int j = 0; j < tc; j++) {
                if (s[i] == t[j]) {
                    dp[i+1][j+1] = Math.max(dp[i+1][j+1], dp[i][j]+1);
                }
                dp[i+1][j+1] = Math.max(dp[i+1][j+1], dp[i+1][j]);
                dp[i+1][j+1] = Math.max(dp[i+1][j+1], dp[i][j+1]);
            }
        }

        String ans = "";
        while (sc > 0 && tc > 0) {
            if (dp[sc][tc] == dp[sc-1][tc]) {
                sc--;
            } else if (dp[sc][tc] == dp[sc][tc-1]) {
                tc--;
            } else {
                ans = (char)s[sc-1] + ans;
                sc--;
                tc--;
            }
        }
        System.out.println(ans);
    }

    public static int setArray(int array[]) throws Exception {
        int count = 0;
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            array[count] = c;
            count++;
        }
        return count;
    }
}
