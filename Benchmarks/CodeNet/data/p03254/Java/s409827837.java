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
        long x = scan.nextLong();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
        }
        Arrays.sort(a);
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                if (a[i] == x) {
                    answer += 1;
                }
                break;
            }
            if (a[i] <= x) {
                answer += 1;
                x -= a[i];
                continue;
            }
            break;
        }
        System.out.println(answer);
    }
}
