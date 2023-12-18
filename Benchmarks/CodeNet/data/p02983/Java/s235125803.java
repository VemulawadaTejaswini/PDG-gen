import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        long ans = solve(l, r);
        System.out.println(ans);
    }

    private static long solve(int l, int r) {
        long R = Math.min(l + 2019, r);
        long ans = 2018;
        for (long i = l; i <= R; i++) {
            for (long j = i + 1; j <= R; j++) {
                long x = i * j % 2019;
                ans = Math.min(ans, x);
                if (ans == 0) {
                    return 0;
                }
            }
        }
        return ans;
    }
}
