import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i=0; i<N; i++) {
            S[i] = sc.next();
        }

        System.out.println(solve(N, S));
    }

    private static int solve(int N, String[] S) {
        Set<String> set = new HashSet();

        for (int i=0; i<N; i++) {
            set.add(S[i]);
        }

        return set.size();
    }
}