import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < 100000; i++) {
            long cur = K * i;
            int candidate = 0;
            for (long j = 1; j <= 100000000000L; j *= 10) {
                candidate += cur % (j * 10) / j;
            }
            ans = Math.min(ans, candidate);
        }
        System.out.println(ans);
    }
}