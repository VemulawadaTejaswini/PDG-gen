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
        String s = scan.next();
        String t = scan.next();
        if (s.equals(t)) {
            System.out.println(N);
            return;
        }
        char[] d_s = s.toCharArray();
        char[] d_t = t.toCharArray();
        int max = 0;
        for (int i = N-2 ; 0 <= i; i--) {
            if (d_t[i] != d_s[N-1]) {
                continue;
            }
            boolean found = true;
            for (int j = i; 0 <= j; j--) {
                if (d_t[j] != d_s[N-1-(i-j)]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                max = Math.max(max, i + 1);
            }
        }
        System.out.println(2 * N - max);
    }
}
