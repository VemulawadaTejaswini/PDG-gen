import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            b[i] = scan.nextInt();
        }
        int sum_a = Arrays.stream(a).sum();
        int sum_b = Arrays.stream(b).sum();
        if (sum_b < sum_a) {
            System.out.println("No");
            return;
        }
        int diff = sum_b - sum_a;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (b[i] < a[i]) {
                count += a[i] - b[i];
                b[i] += a[i] - b[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if (a[i] < b[i]) {
                int k = (b[i] - a[i]) / 2;
                count -= k;
                a[i] += 2 * k;
                if (a[i] < b[i]) {
                    a[i] += 2;
                    b[i] += 1;
                }
            }
        }
        if (count <= 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
