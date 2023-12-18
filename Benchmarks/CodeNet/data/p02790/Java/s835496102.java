import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solve(a, b));
    }

    private static String solve(int a, int b) {
        String ans = "";

        if (a < b) {
            for (int i=0; i<b; i++) {
                ans += a;
            }
        } else {
            for (int i=0; i<a; i++) {
                ans += b;
            }
        }

        return ans;
    }
}