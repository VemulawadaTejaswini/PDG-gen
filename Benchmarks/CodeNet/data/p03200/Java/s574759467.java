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

    private static long solve(String S) {
        long count = 0;
        int black = 0;

        for (int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == 'B') black++;
            else {
                count += black;
            }
        }

        return count;
    }
}