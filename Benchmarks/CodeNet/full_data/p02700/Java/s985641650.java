import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        System.out.println(solve(A, B, C, D) ? YES : NO);
    }

    private static boolean solve(int A, int B, int C, int D) {
        while (true) {
            C -= B;
            if (C <= 0) return true;

            A -= D;
            if (A <= 0) return false;
        }
    }
}