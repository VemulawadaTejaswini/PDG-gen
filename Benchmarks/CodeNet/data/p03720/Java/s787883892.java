import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N + 1];
        for (int i = 0; i < M; i++) {
            a[sc.nextInt()] += 1;
            a[sc.nextInt()] += 1;
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(a[i]);
        }
    }
}