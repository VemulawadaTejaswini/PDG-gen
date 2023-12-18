import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 10000000;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt();
        }
        Arrays.parallelSort(a);
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(r * r);
        sc.close();
    }
}
