import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int ans = solve(N, a);
        System.out.println(ans);
    }

    private static int solve(int N, int[] a) {
        int diff = 0;

        Arrays.sort(a);
        for (int i=0; i<N; i++) {
            diff += i%2 == 0 ? a[N - i - 1] : -a[N - i - 1];
        }

        return diff;
    }
}
