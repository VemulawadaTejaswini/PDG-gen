import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        System.out.println(solve(X));
    }

    private static String solve(long X) {
        for (long i=0; i<=1000; i++) {
            for (long j=-2000; j<=2000; j++) {
                long tmp = (long)Math.pow(i, 5) - (long)Math.pow(j, 5);

                if (tmp == X) {
                    return i + " " + j;
                }
            }

        }

        return null;
    }
}