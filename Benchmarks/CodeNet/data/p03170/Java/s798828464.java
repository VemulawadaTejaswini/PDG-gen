import java.util.*;

public class Main {
    private static String solve(int N, int K, int[] a) {
        boolean[] win = new boolean[K + 1];
        for (int i = 0; i < K; i++) {
            if (win[i]) continue;

            for (int j = 0; j < N; j++) {
                int newAmount = i + a[j];
                if (newAmount <= K) win[newAmount] = true;
            }
        }
        return win[K] ? "First": "Second";
    }

    public static String run(Scanner scanner) {
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] a = new int[N];
        for (int i=0; i < N; i++) a[i] = scanner.nextInt();

        return solve(N, K, a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}