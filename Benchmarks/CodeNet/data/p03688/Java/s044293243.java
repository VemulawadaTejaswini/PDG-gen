import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();
        if (N == 2) {
            System.out.println("Yes");
            return;
        }
        if (2 <= max - min) {
            System.out.println("No");
            return;
        }
        if (max - min == 0) {
            if (max == N - 1 || max * 2 <= N) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            return;
        }
        int max_count = 0;
        for (int i = 0; i < N; i++) {
            if (max == a[i]) {
                max_count += 1;
                continue;
            }
        }
        if (max_count == N - max + 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

