import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int res = 0;
        for (int i = 0; i < N; i++) {
            int tmpRes = gcdSkip(A, N, i);
            res = Math.max(tmpRes, res);
        }

        System.out.println(res);
    }

    public static int gcdSkip(int[] A, int N, int skip) {
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (skip == i) continue;
            if (res == 0) {
                res = A[i];
                continue;
            }
            res = gcd(A[i], res);
        }
        return res;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}