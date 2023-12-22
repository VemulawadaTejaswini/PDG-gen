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
        long[] l = new long[N];
        for (int i = 0; i < N; i++) {
            l[i] = scan.nextLong();
        }
        Arrays.sort(l);
        if (N <= 2) {
            System.out.println(0);
            return;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (l[i] == l[j] || l[i] == l[k] || l[j] == l[k]) {
                        continue;
                    }
                    if (l[k] < l[i] + l[j]) {
                        ans += 1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
