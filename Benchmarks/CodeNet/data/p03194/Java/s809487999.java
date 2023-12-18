import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long P = sc.nextLong();
        if (N == 1) {
            System.out.println(P);
            return;
        }

        long maxGcd = 1;
        for (long d=2; d<P/2+1; d++) {
            long times = 0;
            while (P % d == 0) {
                P /= d;
                times++;
            }
            if (times >= N) {
                maxGcd *= Math.pow(d, times/N);
            }
            if (P == 1) { break; }
        }
        System.out.println(maxGcd);
    }
}
