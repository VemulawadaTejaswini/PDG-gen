import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cnt = new int[n][26];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                cnt[i][c - 'a']++;
            }
        }

        int[] commonCnt = new int[26];
        for (int j = 0; j < 26; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                min = Math.min(cnt[i][j], min);
            }
            commonCnt[j] = min;
        }

        for (int j = 0; j < 26; j++) {
            for (int i = 0; i < commonCnt[j]; i++) {
                out.print((char) ('a' + j));
            }
        }
        out.println();
    }
}