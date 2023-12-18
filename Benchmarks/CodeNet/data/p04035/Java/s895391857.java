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
        int L = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        boolean found = false;
        int left = 0;
        for (int i = 0; i < N - 1; i++) {
            if (L <= a[i] + a[i + 1]) {
                found = true;
                left = i;
                break;
            }
        }
        if (!found) {
            System.out.println("Impossible");
            return;
        }
        for (int i = 0; i < left; i++) {
            System.out.println(i + 1);
        }
        for (int i = left + 2; i < N; i++) {
            System.out.println(i + 1);
        }
        System.out.println(left + 1);
    }

}