import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        long B = sc.nextLong();
        long N = sc.nextLong();

        long ok = 1;
        long ng = 1_000_000_000_010L;

        while (ok+1 < ng) {
            long now = (ok+ng)/2;
            if (calc(now,A,B) <= N) {
                ok = now;
            } else {
                ng = now;
            }
        }
 
        System.out.println(calc(ok,A,B));
    }

    private static long calc(long x, int A, long B) {
        return A*x/B - A*(x/B);
    }
}
