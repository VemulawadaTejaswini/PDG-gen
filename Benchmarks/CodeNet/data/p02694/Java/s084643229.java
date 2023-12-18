import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();

        System.out.println(solve(X));
    }

    private static int solve(long X) {
        long current = 100;
        int year = 0;

        while(true) {
            current *= 1.01;
            year++;
            if (current >= X) break;
        }

        return year;
    }
}