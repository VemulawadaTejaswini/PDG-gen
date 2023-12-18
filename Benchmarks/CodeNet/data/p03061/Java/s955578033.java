import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, arraysGcd(a, n, i));
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

    static int arraysGcd(int[] a, int n, int i) {
        int g;
        if (i == 0)
            g = a[1];
        else
            g = a[0];
        for (int j = 1; j < n; j++) {
            if (j != i)
                g = gcd(g, a[j]);
        }
        return g;
    }
}