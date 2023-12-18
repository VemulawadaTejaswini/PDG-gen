import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int Y = scan.nextInt();
        int[] a = new int[3];
        Arrays.fill(a, -1);
        boolean found = false;
        for (int i = 0; i <= N; i++) {
            if (Y < i * 10000) {
                continue;
            }
            int remain1 = Y - i * 10000;
            for (int j = 0; j <= N - i; j++) {
                if (remain1 < j * 5000) {
                    continue;
                }
                int remain2 = remain1 - j * 5000;
                if (N - i - j == remain2 / 1000) {
                    a[0] = i;
                    a[1] = j;
                    a[2] = N - i - j;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        System.out.printf("%d %d %d\n",a[0],a[1],a[2]);

    }
}
