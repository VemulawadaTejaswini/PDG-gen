import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(solve(S));
    }

    private static String solve(String S) {
        for (int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            if (i%2 == 1) {
                if (c == 'R') {
                    return NO;
                }
            } else {
                if (c == 'L') {
                    return NO;
                }
            }
        }

        return YES;
    }
}