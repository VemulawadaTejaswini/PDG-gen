import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long ans = Long.MAX_VALUE;
        for (long i = 1; i < 10000000; i++) {
            long cur = K * i;
            long candidate = 0;
            for (long j = 1; j <= 1000000000000L; j *= 10) {
                candidate += cur % (j * 10) / j;
            }
            ans = Math.min(ans, candidate);
        }
        System.out.println(ans);
    }
}