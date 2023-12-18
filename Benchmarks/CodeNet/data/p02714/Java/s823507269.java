import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] d = S.toCharArray();
        int[] red = new int[N];
        int[] green = new int[N];
        int[] blue = new int[N];
        for (int i = 0; i < N; i++) {
            if (d[i] == 'R') {
                red[i] = 1;
            }
            if (d[i] == 'G') {
                green[i] = 1;
            }
            if (d[i] == 'B') {
                blue[i] = 1;
            }
        }
        int[] sum_red = new int[N+1];
        for (int i = 1; i <= N; i++) {
            sum_red[i] = sum_red[i-1] + red[i-1];
        }
        int[] sum_green = new int[N+1];
        for (int i = 1; i <= N; i++) {
            sum_green[i] = sum_green[i-1] + green[i-1];
        }
        int[] sum_blue = new int[N+1];
        for (int i = 1; i <= N; i++) {
            sum_blue[i] = sum_blue[i-1] + blue[i-1];
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (d[i] == d[j]) {
                    continue;
                }
                int k = j + (j - i);
                if (d[i] != 'R' && d[j] != 'R') {
                    ans += sum_red[N] - sum_red[j+1];
                }
                if (d[i] != 'G' && d[j] != 'G') {
                    ans += sum_green[N] - sum_green[j+1];
                }
                if (d[i] != 'B' && d[j] != 'B') {
                    ans += sum_blue[N] - sum_blue[j+1];
                }
                if (N <= k) {
                    continue;
                }
                if (d[i] != d[k] && d[j] != d[k]) {
                    ans -= 1;
                }
            }
        }
        System.out.println(ans);
    }

}
