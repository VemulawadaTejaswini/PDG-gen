import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long N = S.nextLong();
        long K = S.nextLong();
        long Nx = N % K;
        System.out.println(replace(Nx, K));
        S.close();
    }

    public static long replace(long x, long K) {
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