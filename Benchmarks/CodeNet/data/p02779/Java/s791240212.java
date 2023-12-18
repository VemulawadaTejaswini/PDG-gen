import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve2(N, A) ? YES : NO);
    }

    private static boolean solve2(int N, int[] A) {
        Arrays.sort(A);

        for (int i=1; i<N; i++) {
            if (A[i-1] == A[i]) return false;
        }

        return true;
    }


    private static boolean solve(int N, int[] A) {
        boolean[] fill = new boolean[(int)Math.pow(10, 9)+1];

        for (int i=0; i<N; i++) {
            if(fill[A[i]]) return false;

            fill[A[i]] = true;
        }

        return true;
    }
}