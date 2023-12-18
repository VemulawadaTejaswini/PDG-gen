import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        int h[] = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                int H = 0;
                Boolean B = true;
                for (int k = 0; k < N; k++) {

                    if (h[k] != 0) {
                        H = h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - j);
                    }
                }
                for (int k = 0; k < N; k++) {
                    if (h[k] != Math.max(H - Math.abs(x[k] - i) - Math.abs(y[k] - j), 0)) {
                        B = false;
                    }
                }
                if (B) {
                    System.out.println(i + " " + j + " " + H);
                }
            }
        }
    }
}