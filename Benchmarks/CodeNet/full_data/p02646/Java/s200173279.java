import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();

        System.out.println(solve(A, V, B, W, T) ? "YES" : "NO");
    }

    private static boolean solve(int A, int V, int B, int W, int T) {
        if (V <= W) return false;

        long dist = Math.abs(A - B);
        long velocity = V - W;

        if (dist <= (long)T * velocity) return true;


        return false;
    }
}