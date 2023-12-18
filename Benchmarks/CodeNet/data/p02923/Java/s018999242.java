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
        long[] h = new long[N];
        for (int i = 0; i < N; i++) {
            h[N-i-1] = scan.nextLong();
        }
        long[] s = new long[N];
        s[0] = 0;
        for (int i = 1; i < N; i++) {
            if (h[i-1] <= h[i]) {
                s[i] = s[i-1] + 1;
            } else {
                s[i] = 0;
            }
        }
        long answer = Arrays.stream(s).max().getAsLong();
        System.out.println(answer);
    }
}
