import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        int n = a[N-1];
        int r = 0;
        int min_target = 0;
        int target = -1;
        for (int i = 0; i < N - 1; i++) {
            target = a[i];
            if (n / 2 < a[i]) {
                target = n - a[i];
            }
            if (min_target < target) {
                min_target = target;
                r = a[i];
            }
        }
        System.out.printf("%d %d\n", n, r);
    }
}
