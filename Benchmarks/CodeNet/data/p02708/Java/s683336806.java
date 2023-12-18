import java.util.Scanner;

public class Main {
    private static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        long total = 0;

        for (long i = K; i <= N+1; i++) {
            long min = sum(i-1);
            long max = sum(N) - sum(N-i);
            long diff = (max - min) + 1;
            total = (total + diff);
        }
        System.out.println(total % MOD);
    }

    private static long sum(long i) {
        return i*(i+1)/2;
    }
}