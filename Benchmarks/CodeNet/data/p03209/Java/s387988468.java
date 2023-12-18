import java.util.Scanner;

public class Main {
    public static long[] AtsusaDP = new long[51];

    static {
        AtsusaDP[0] = 1L;
        for (int i = 0; i < 50; i++) {
            AtsusaDP[i + 1] = 3L + 2 * AtsusaDP[i];
        }
    }

    public static long[] P_CountDP = new long[51];

    static {
        P_CountDP[0] = 1;
        for (int i = 0; i < 50; i++) {
            P_CountDP[i + 1] = 1L + 2 * P_CountDP[i];
        }
    }


    public static long ans = 0L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();

        eatBG(n, x);
        System.out.println(ans);
    }

    /**
     * @param level ハンバーガーのレベル
     * @param rest  残りの食べるべき数
     * @return 新しい残りの食べるべき数
     */
    private static long eatBG(int level, long rest) {
        if (level == 0) {
            if (rest > 0) {//P part
                ans++;
                return rest-1;
            } else {
                return rest;
            }
        }

        if (rest >= AtsusaDP[level]) {
            rest -= AtsusaDP[level];
            ans += P_CountDP[level];
            return rest;
        } else {
            rest--;//B part
            if (rest > 0) rest = eatBG(level - 1, rest);// n-1 BG part
            if (rest > 0) {//P part
                rest--;
                ans++;
            }
            if (rest > 0) {//n-1 part
                rest = eatBG(level - 1, rest);
            }
            rest--;//B part
            return rest;
        }
    }
}
