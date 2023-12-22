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
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N ; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }
        long ans = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, func0(x[i],y[i]));
            min = Math.min(min, func0(x[i],y[i]));
        }
        ans = max - min;
        max = Long.MIN_VALUE;
        min = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, func1(x[i],y[i]));
            min = Math.min(min, func1(x[i],y[i]));
        }
        ans = Math.max(ans, max - min);
        System.out.println(ans);
    }
    private int func0(int x, int y) {
        return x - y;
    }
    private int func1(int x, int y) {
        return x + y;
    }
}
