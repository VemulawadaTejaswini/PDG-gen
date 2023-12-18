import java.util.Scanner;

public class Main {
    Scanner   sc   = new Scanner(System.in);
    final int MOD   = 1000000007;

    void run() {
        int N = sc.nextInt();
        int[] T = new int[N];
        int[] A = new int[N];
        for (int i = 0; i < N; i++) T[i] = sc.nextInt();
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        if (T[N - 1] != A[0]) {
            System.out.println(0);
            return;
        }

        boolean[] f = new boolean[N];
        f[0] = f[N - 1] = true;
        for (int i = 0; i < N - 1; i++) {
            if (T[i] != T[i + 1]) {
                f[i + 1] = true;
                if (T[i + 1] > A[i + 1]) {
                    System.out.println(0);
                    return;
                }
            }
        }
        for (int i = N - 1; i >= 1; i--) {
            if (A[i - 1] != A[i]) {
                f[i - 1] = true;
                if (A[i - 1] > T[i - 1]) {
                    System.out.println(A);
                    return;
                }
            }
        }

        long cnt = 1;
        for (int i = 0; i < N; i++) {
            if (!f[i]) {
                cnt *= Math.min(A[i], T[i]);
                cnt %= MOD;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}