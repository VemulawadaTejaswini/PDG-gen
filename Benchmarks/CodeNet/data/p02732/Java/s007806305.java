import java.util.Scanner;

public class Main {
    final static int M = 200005;
    static long[] f = new long[M];
    static int[] a = new int[M];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            f[a[i]]++;
        }
        for (int i = 0; i < M; i++) {
            if (f[i] != 0) ans += f[i] * (f[i] - 1) / 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans -  f[a[i]] + 1);

        }
    }
}
