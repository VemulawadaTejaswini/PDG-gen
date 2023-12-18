import java.util.Scanner;

public class Main {

    private static int N;
    private static int[] P;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    private static int solve() {
        int[] seq = new int[N+1];

        int max = 0;
        for (int i = 0; i < N; i++) {
            int p = P[i];
            seq[p] = seq[p-1] + 1;
            max = Math.max(seq[p], max);
        }

        return N - max;
    }
}
