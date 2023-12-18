import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int[] lgcd = new int[n];
        int[] rgcd = new int[n];
        lgcd = arraysLGcd(a, n);
        rgcd = arraysRGcd(a, n);
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(lgcd[i], rgcd[i]), ans);
        }
        System.out.println(ans);
        sc.close();
    }

    static int gcd(int a1, int a2) {
        if (a1 < a2)
            return gcd(a2, a1);
        if (a2 == 0)
            return a1;
        return gcd(a2, a1 % a2);
    }

    static int[] arraysLGcd(int[] a, int n) {
        int g = 0;
        int[] lgcd = new int[n];
        lgcd[0] = 0;
        for (int j = 0; j < n - 1; j++) {
            g = gcd(g, a[j]);
            lgcd[j + 1] = g;
        }
        return lgcd;
    }

    static int[] arraysRGcd(int[] a, int n) {
        int g = 0;
        int[] rgcd = new int[n];
        rgcd[n - 1] = 0;
        for (int j = n - 1; j > 0; j--) {
            g = gcd(g, a[j]);
            rgcd[j - 1] = g;
        }
        return rgcd;
    }
}