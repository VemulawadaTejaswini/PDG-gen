import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long ans = solve(A, 0, N-1, 1, 1) + A[0] + A[N-1];
        System.out.println(ans);
    }
    public static long solve(long[] A, int left, int right, int c_l, int c_r) {
        if (left + 1 == right) {
            return 0;
        }
        long ans = Long.MAX_VALUE;
        for (int i = left + 1; i < right; i++) {
            ans = Math.min(ans, solve(A, left, i, c_l, c_l + c_r) + solve(A, i, right, c_l + c_r, c_r) + (c_l + c_r) * A[i]);
        }
        return ans;
    }
}
