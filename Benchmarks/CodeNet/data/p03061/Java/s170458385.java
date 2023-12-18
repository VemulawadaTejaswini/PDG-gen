import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] forward = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            forward[i + 1] = gcd(a[i], forward[i]);
        }

        int best = forward[n];
        int current = 0;
        for (int i = 1; i < n; i++) {
            best = Math.max(best, gcd(current, forward[n - i]));
            current = gcd(current, a[n - i]);
        }
        best = Math.max(best, current);
        System.out.println(best);
    }

    private static int gcd(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if (min == 0) return max;
        return gcd(min, max % min);
    }
}