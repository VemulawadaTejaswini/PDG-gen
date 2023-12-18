import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println(solve(N, A, B));
    }

    private static long solve(long N, long A, long B) {
        long count = 0;

        if ((B-A)%2 == 0) {
            count = (B-A)/2;
        } else {
            count = Math.min(
                    A+(B-A-1)/2,
                    N-B+1+(B-A-1)/2
            );
        }

        return count;
    }
}