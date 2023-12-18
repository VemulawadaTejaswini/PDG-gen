import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(solve(N, M));
    }

    private static int solve(int N, int M) {
        int count = 0;

        if (N >= 2) {
            count += N * (N-1)/2;
        }
        if (M >= 2) {
            count += M * (M-1)/2;
        }

        return count;
    }
}