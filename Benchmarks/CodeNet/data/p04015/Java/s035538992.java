import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println(solve(N, A, x));
    }

    private static long solve(int n, int a, int[] x) {
        int[] y = Arrays.stream(x).map(i -> i - a).toArray();
        return brute(n - 1, 0, y);
    }

    private static long brute(final int i, final int n, final int[] y) {
        if (i < 0) return 0;
        return (n + y[i] == 0 ? 1 : 0) + brute(i - 1, n, y) + brute(i - 1, n + y[i], y);
    }
}