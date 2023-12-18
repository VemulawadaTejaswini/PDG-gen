import java.util.*;

public class Main {
    private static final int M =  1000000007;

    private static long solve(int N, int K, int[] a) {
        int[] ways = new int[K+1];
        int[] next = new int[K+1];
        ways[0] = 1;

        for (int ai: a) {
            int s = 0;
            for (int i = 0; i <= K; i++) {
                int add = ways[i];
                int remove = (i-ai-1 >= 0) ? ways[i-ai-1]: 0;
                s = (s + add - remove) % M;
                if (s < 0) s += M;

                next[i] = s;
            }

            int[] tmp = ways;
            ways = next;
            next = tmp;
        }

        return ways[K];
    }

    public static long run(Scanner scanner) {
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
