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
        int k = sc.nextInt();
        int[] p = new int[n + 1];

        for (int i = 0; i < k; i++) {
            int jmax = sc.nextInt();
            for (int j = 0; j < jmax; j++) {
                int tmp = sc.nextInt();
                p[tmp]++;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (p[i] == 0) {
                res++;
            }
        }

        System.out.println(res);
        sc.close();
    }
}
