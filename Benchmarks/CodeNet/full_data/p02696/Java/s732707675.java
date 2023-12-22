import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        long B = sc.nextLong();
        long N = sc.nextLong();

        System.out.println(solve(A, B, N));
    }

    private static long solve(int A, long B, long N) {
        long x=Math.min(B-1, N);

        double val = Math.floor(A*x);

        return (long)(A*x/B) -  A*((long)(x/B));
    }
}