import java.util.*;

public class Main {
    private static long solve(int N, int[] a) {
        long[][] score = new long[N][N];
        int parity = N % 2;

        for (int i = N-1; i >=0; i--)
            score[i][i] = parity == 1 ? a[i]: -a[i];

        for (int e = 1; e < N; e++)
            for (int s = e - 1, turn = 1-parity; s >= 0; s--, turn = 1-turn)
                score[s][e] = turn == 1 ?
                    Math.max(score[s][e - 1] + a[e], score[s + 1][e] + a[s])
                    : Math.min(score[s][e - 1] - a[e], score[s + 1][e] - a[s]);

        return score[0][N-1];
    }

    public static long run(Scanner scanner) {
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i=0; i < N; i++) a[i] = scanner.nextInt();

        return solve(N, a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}