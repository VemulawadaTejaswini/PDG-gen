import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";
    private static final String IMPOSSIBLE = "IMPOSSIBLE";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(solve(A, B));
    }

    private static String solve(int A, int B) {
        if ((A+B)%2 != 0) return IMPOSSIBLE;

        return String.valueOf((A+B)/2);
    }
}