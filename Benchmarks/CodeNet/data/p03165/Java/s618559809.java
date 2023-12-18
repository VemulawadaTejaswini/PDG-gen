import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int N = s.length();
        int M = t.length();
        int[][] dp = new int[N + 1][M + 1];
        int[][] prevI = new int[N + 1][M + 1];
        int[][] prevJ = new int[N + 1][M + 1];

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                if (dp[i-1][j] >= dp[i][j-1]) {
                    dp[i][j] = dp[i-1][j];
                    prevI[i][j] = i - 1;
                    prevJ[i][j] = j;
                } else {
                    dp[i][j] = dp[i][j-1];
                    prevI[i][j] = i;
                    prevJ[i][j] = j-1;
                }
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    prevI[i][j] = i-1;
                    prevJ[i][j] = j-1;
                }
            }
        }
        List<Character> ansList = new ArrayList<>();
        int n = N - 1;
        int m = M - 1;
        int len = 0;
        while (n >= 0 && m >= 0 && len < dp[N][M]) {
            int pi = prevI[n+1][m+1];
            int pj = prevJ[n+1][m+1];
            if (pi == n && pj == m) {
                ansList.add(s.charAt(n));
            } 
            n = pi-1;
            m = pj-1;
        }
        Collections.reverse(ansList);
        StringBuilder sb = new StringBuilder();
        for (Character c : ansList) {
            sb.append(c);
        }
        String ans = sb.toString();
        System.out.println(ans);
    }
}