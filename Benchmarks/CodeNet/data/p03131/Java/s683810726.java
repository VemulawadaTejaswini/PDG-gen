import java.util.Scanner;

public class Main {

    private static long solve(long K, long A, long B) {
        if (B <= (A + 2)) {
            return 1 + K;
        }

        long rest = K - (A + 1);
        if (rest < 0) {
            return 1 + K;
        }

        long ex = rest / 2;
        long m = rest % 2;

        return ex * (B - A) + B + m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long K = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println(solve(K, A, B));
    }
}
