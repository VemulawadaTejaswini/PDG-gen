import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            int[] s = new int[N];
            for (int i = 0; i < N; i++) {
                s[i] = S.charAt(i) == 'L' ? 0 : 1;
            }

            int score = score(s);
//            Utils.debug(score(s));
//            for (int l = 0; l < s.length; l++) {
//                for (int r = l + 1; r < s.length; r++) {
//                    reverse(s, l, r);
//                    Utils.debug(l, r, score(s));
//                    reverse(s, l, r);
//                }
//            }

            System.out.println(Math.min(N - 1, score + 2 * K));
        }
    }

    private static void reverse(int[] s, int l, int r) {
        for (int l2 = l, r2 = r; l2 < r2; l2++, r2--) {
            int swap = s[l2];
            s[l2] = s[r2];
            s[r2] = swap;
        }
        for (int i = l; i <= r; i++) {
            s[i] = 1 - s[i];
        }
    }

    private static int score(int[] s) {
        int score = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 0 && (i - 1 >= 0 && s[i - 1] == 0)) {
                score++;
            }
            if (s[i] == 1 && (i + 1 < s.length && s[i + 1] == 1)) {
                score++;
            }
        }
        return score;
    }
}
