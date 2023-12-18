import java.util.*;

public class Main {
    private final static int M = 1000000007;

    private static int solve(int N, boolean[][] a) {
        int states = 1 << N;

        int[] memo = new int[states];
        Arrays.fill(memo, -1);

        boolean[] state = new boolean[N];
        Arrays.fill(state, true);

        return solve(state, a, memo);
    }

    private static int solve(boolean[] state, boolean[][] a, int[] memo) {
        int packedState = 0;
        int bits = 0;

        for (int i=0, p=1; i < state.length; i++, p <<= 1) {
            if (!state[i]) continue;

            packedState += p;
            bits++;
        }

        if (bits == 0) return 1;
        if (memo[packedState] != -1) return memo[packedState];

        int result = 0;
        for (int j = 0; j < state.length; j++) {
            if (!a[bits-1][j]) continue;
            if (!state[j]) continue;

            state[j] = false;
            result = (result + solve(state, a, memo)) % M;
            state[j] = true;
        }

        memo[packedState] = result;
        return result;
    }

    public static int run(Scanner scanner) {
        int N = scanner.nextInt();
        boolean[][] a = new boolean[N][N];
        for (int i=0; i < N; i++)
            for (int j=0; j < N; j++)
                a[i][j] = scanner.nextInt() == 1;

        return solve(N, a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}