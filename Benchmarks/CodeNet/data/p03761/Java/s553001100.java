import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        System.out.println( solve(N, S) );
    }

    private static String solve(long N, String[] S) {
        StringBuilder ans = new StringBuilder();

        for (char c = 'a';c <= 'z'; c++) {
            int cnt = countCommonChar(c, S);

            for (int i = 0; i < cnt; i++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }

    private static int countCommonChar(char c, String[] S) {
        int common = Integer.MAX_VALUE;
        for (String s : S) {
            common = Math.min(countChar(c, s), common);
        }
        return common;
    }

    private static int countChar(char c, String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) == c ) {
                cnt ++;
            }
        }
        return cnt;
    }
}
