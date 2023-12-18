import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println(solve(A, B));
    }

    private static int solve(long A, long B) {
        int count = 1;

        List<Long> primeA = new ArrayList();
        if (A%2 == 0) primeA.add((long)2);
        while (A%2 == 0) {
            A /= 2;
        }
        for (long i=3; i<=A; i+=2) {
            if (A%i == 0) {
                primeA.add(i);

                while (A%i == 0) A/= i;
            }
        }

        List<Long> primeB = new ArrayList();
        if (B%2 == 0) primeB.add((long)2);
        while (B%2 == 0) B/= 2;
        for (long i=3; i<=B; i+=2) {
            if (B%i == 0) {
                primeB.add(i);

                while (B%i == 0) B /= i;
            }
        }

        for (long i : primeA) {
            if (primeB.contains(i)) {
                count++;
            }
        }


        return count;
    }
}