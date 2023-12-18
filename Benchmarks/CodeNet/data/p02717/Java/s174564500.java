import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long N = S.nextLong();
        long K = S.nextLong();
        System.out.println(replace(N, K));
        S.close();
    }

    public static long replace(long x, long K) {
        if (K == 1) {
            return 0L;
        } else if (K == 2) {
            if (x % 2 == 2) {
                return 0L;
            } else {
                return 1L;
            }
        }
        long div = x - K;
        if (div < 0) {
            div = -div;
        }
        if (x <= div) {
            return x;
        }
        return replace(div, K);
    }
}