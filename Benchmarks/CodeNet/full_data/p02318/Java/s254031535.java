
import java.util.Scanner;

public class Main {
    static int[][] dp;
    static Scanner sc;

//    public static void main(String[] args) {
//        sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            solve();
//        }
//    }
//
//    static void solve() {
//        char[] a = sc.next().toCharArray();
//        char[] b = sc.next().toCharArray();
//        if (a.length < b.length) {
//            char[] c = a;
//            a = b;
//            b = c;
//        }
//        dp = new int[a.length + 1][b.length + 1];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                dp[i + 1][j + 1] = a[i] == b[j] ? dp[i][j] + 1 : Math.max(dp[i + 1][j], dp[i][j + 1]);
//            }
//        }
//        System.out.println(dp[a.length][b.length]);
//    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        if (a.length < b.length) {
            char[] c = a;
            a = b;
            b = c;
        }
        dp = new int[a.length + 1][b.length + 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                dp[i + 1][j + 1] = a[i] == b[j] ? dp[i][j] + 1 : Math.max(dp[i + 1][j], dp[i][j + 1]);
            }
        }
        System.out.println(Math.max(a.length, b.length) - dp[a.length][b.length]);

    }

}

