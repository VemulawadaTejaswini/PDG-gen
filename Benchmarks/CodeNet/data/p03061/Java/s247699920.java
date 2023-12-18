import java.util.Scanner;

public class Main {
    int gcd(int a, int b) {
        if (a > b) return gcd(b, a);
        if (a <= 1) return b;
        return gcd(b % a, a);
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }

        int[] ls = new int[n];
        int[] rs = new int[n];
        for (int i = 0; i < n; i++) {
            int j = n - i - 1;
            if (i == 0) {
                ls[i] = as[i];
                rs[j] = as[j];
            } else {
                ls[i] = gcd(ls[i - 1], as[i]);
                rs[j] = gcd(rs[j + 1], as[j]);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans = Math.max(ans, rs[1]);
            } else if (i == n - 1) {
                ans = Math.max(ans, ls[n - 2]);
            } else {
                ans = Math.max(ans, gcd(ls[i - 1], rs[i + 1]));
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}