import java.util.Arrays;
import java.util.Scanner;

/**
 * Domino Quality
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            if (N == 2) {
                System.out.println(-1);
                return;
            }

            if (N == 3) {
                System.out.println("aa.");
                System.out.println("..a");
                System.out.println("..a");
                return;
            }

            char[][] c = new char[N][N];
            for (int i = 0; i < N; i++) {
                Arrays.fill(c[i], '.');
            }

            int M = N / 4;
            if (N % 4 != 0) {
                M--;
            }

            for (int i = 0; i < M; i++) {
                place4(c, i * 4);
            }

            if (N % 4 == 1) {
                place5(c, M * 4);
            } else if (N % 4 == 2) {
                place6(c, M * 4);
            } else if (N % 4 == 3) {
                place7(c, M * 4);
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < N; i++) {
                ans.append(c[i]).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

    static void place4(char[][] c, int n) {
        System.arraycopy("aabc".toCharArray(), 0, c[n], n, 4);
        System.arraycopy("ddbc".toCharArray(), 0, c[n + 1], n, 4);
        System.arraycopy("bcaa".toCharArray(), 0, c[n + 2], n, 4);
        System.arraycopy("bcdd".toCharArray(), 0, c[n + 3], n, 4);
    }

    static void place5(char[][] c, int n) {
        System.arraycopy("aabba".toCharArray(), 0, c[n], n, 5);
        System.arraycopy("bcc.a".toCharArray(), 0, c[n + 1], n, 5);
        System.arraycopy("b..cb".toCharArray(), 0, c[n + 2], n, 5);
        System.arraycopy("a..cb".toCharArray(), 0, c[n + 3], n, 5);
        System.arraycopy("abbaa".toCharArray(), 0, c[n + 4], n, 5);
    }

    static void place6(char[][] c, int n) {
        System.arraycopy("aabc..".toCharArray(), 0, c[n], n, 6);
        System.arraycopy("ddbc..".toCharArray(), 0, c[n + 1], n, 6);
        System.arraycopy("..aabc".toCharArray(), 0, c[n + 2], n, 6);
        System.arraycopy("..ddbc".toCharArray(), 0, c[n + 3], n, 6);
        System.arraycopy("bc..aa".toCharArray(), 0, c[n + 4], n, 6);
        System.arraycopy("bc..dd".toCharArray(), 0, c[n + 5], n, 6);
    }

    static void place7(char[][] c, int n) {
        System.arraycopy("aabbcc.".toCharArray(), 0, c[n], n, 7);
        System.arraycopy("dd.dd.a".toCharArray(), 0, c[n + 1], n, 7);
        System.arraycopy("..d..da".toCharArray(), 0, c[n + 2], n, 7);
        System.arraycopy("..d..db".toCharArray(), 0, c[n + 3], n, 7);
        System.arraycopy("dd.dd.b".toCharArray(), 0, c[n + 4], n, 7);
        System.arraycopy("..d..dc".toCharArray(), 0, c[n + 5], n, 7);
        System.arraycopy("..d..dc".toCharArray(), 0, c[n + 6], n, 7);
    }

}
