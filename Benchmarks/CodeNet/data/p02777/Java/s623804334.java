import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String U = sc.next();

        System.out.println(solve(S, T, A, B, U));
    }

    private static String solve(String S, String T, int A, int B, String U) {

        if (S.equals(U)) {
            A--;
        } else {
            B--;
        }

        return A + " " + B;
    }
}