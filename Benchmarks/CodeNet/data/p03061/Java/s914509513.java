import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n == 2)
            ans = Math.max(a[0], a[1]);
        else {
            int[] L = a.clone();
            for (int i = 1; i < n; i++) {
                L[i] = EuclideanAlgorithm(L[i-1], a[i]);
            }

            int[] R = a.clone();
            for (int i = n-2; i >= 0; i--) {
                R[i] = EuclideanAlgorithm(R[i+1], a[i]);
            }

            ans = Math.max(L[n-2], R[1]);   // 端を消した場合
            for (int i = 1; i < n-1; i++) {
                ans = Math.max(ans, EuclideanAlgorithm(L[i-1], R[i+1]));
            }
        }

        System.out.println(ans);
    }

    public static int EuclideanAlgorithm(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int re = max % min;
        if (re == 0)
            return min;
        return EuclideanAlgorithm(min, re);
    }
}
