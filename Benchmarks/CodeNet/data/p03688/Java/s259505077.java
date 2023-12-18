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
        long max_count = Arrays.stream(a).filter(i -> i == max).count();
        long min_count = Arrays.stream(a).filter(i -> i == min).count();
        if (min_count < max && 2 * (max-min_count) <= max_count){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

