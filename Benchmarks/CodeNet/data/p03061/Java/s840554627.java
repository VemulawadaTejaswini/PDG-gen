import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        // 0からiまでの最大公約数
        int[] leftCache = new int[n];
        leftCache[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftCache[i] = gcd(leftCache[i - 1], a[i]);
//            System.out.println(leftCache[i]);
        }

        // iからn-1までの最大公約数
        int[] rightCache = new int[n];
        rightCache[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightCache[i] = gcd(rightCache[i + 1], a[i]);
//            System.out.println(rightCache[i]);
        }

        int ans = rightCache[1]; // 左端を除いた場合
        for (int i = 0; i < n - 2; i++) {
            int candidate = gcd(leftCache[i], rightCache[i + 2]);
            if (candidate > ans) {
                ans = candidate;
            }
        }
        // 右端を除いた場合
        if (leftCache[n - 2] > ans) {
            ans = leftCache[n - 2];
        }
        System.out.println(ans);
    }

    static int gcd(int a, int b) {
//        if (a == 0 || b == 0) {
//            return 1;
//        }
        if (a > b) {
            if (a % b == 0) {
                return b;
            } else {
                return gcd(b, a % b);
            }
        } else {
            if (b % a == 0) {
                return a;
            } else {
                return gcd(a, b % a);
            }
        }
    }
}
