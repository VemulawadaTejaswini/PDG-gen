import java.util.*;

class Main {

    static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {

        long res = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[] flg = new boolean[n + 1];
        long[] h = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            flg[i] = true;
            h[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (h[a] >= h[b]) {
                flg[b] = false;
            } else if (h[a] <= h[b]) {
                flg[a] = false;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (flg[i]) {
                res++;
            }
        }

        System.out.println(res);
        sc.close();
    }
}
