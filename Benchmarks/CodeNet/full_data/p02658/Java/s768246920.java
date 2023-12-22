import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];

        boolean hasZero = false;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            if (A[i] == 0) hasZero = true;
        }
        if (hasZero) {
            System.out.println(0);
            return;
        }

        long now = 1;
        for (int i = 0; i < N; i++) {
            int dNow = digit(now);
            int dA = digit(A[i]);
            int lNow = mostLeftNum(now, dNow);
            int lA = mostLeftNum(A[i], dA);
            int dl = digit(lNow*lA);
            //System.out.println("# "+dNow+ " "+dA+" "+dl);
            if (dNow + dA + dl >= 19) {
                System.out.println(-1);
                return;
            }
            now *= A[i];
        }

        System.out.println(now > 1_000_000_000_000_000_000L ? -1 : now);
    }

    private static int digit(long n) {
        int ret = 0;
        while (n > 0) {
            n /= 10;
            ret++;
        }
        return ret-1;
    }

    private static int mostLeftNum(long n, int d) {
        long x = 1;
        for (int i = 0; i < d; i++) {
            x *= 10;
        }
        return (int)(n/x);
    }
}
