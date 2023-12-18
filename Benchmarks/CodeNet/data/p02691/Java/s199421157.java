import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve2(N, A));
    }

    private static int solve2(int N, int[] A) {
        int[] list = new int[2_000_000];
        for (int i=0; i<N; i++) {
            if (A[i] > 1_000_000) continue;

            list[i + A[i]]++;
        }

        int count = 0;
        for (int i=0; i<N; i++) {
            if (i > A[i]) {
                count += list[i - A[i]];
            }
        }

        return count;
    }
}