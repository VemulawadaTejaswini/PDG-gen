import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int min = a[0];
        int max = a[N - 1];

        System.out.println(max - min);
    }
}
