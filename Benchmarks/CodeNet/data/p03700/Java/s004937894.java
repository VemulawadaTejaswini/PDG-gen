import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        long ans = solve(n, a, b, h);
        System.out.println(ans);
    }

    static long solve(int n, int a, int b, int[] h) {

        // 最大HP / b を求めることで最大攻撃回数の上限を決めておく
        long maxHp = 0L;
        for (int i = 0; i < n; i++) {
            maxHp = Math.max(h[i], maxHp);
        }

        long L = 0;
        long R = (maxHp / b);
        while (L <= R) {
            long t = (L + R) / 2;

            if (isEnough(t, h, a, b)) {
                L = t + 1;
            } else {
                R = t - 1;
            }
        }

        return L;
    }

    private static boolean isEnough(long t, int[] h, int a, int b) {
        long atackTimes = 0;
        for (int hp : h) {
            if (hp > b * t) {
                double remain = (double) hp - b * t;
                double addDamage = (double) (a - b);
                atackTimes += (int) Math.ceil(remain / addDamage);
            }
        }
        return atackTimes > t;
    }
}
