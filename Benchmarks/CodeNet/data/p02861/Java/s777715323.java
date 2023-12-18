import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < N; i++) {
            HashSet<Integer> set = new HashSet<>();
            set.add(i);
            sum += dfs(0, x, y, N, 1, i, set);
            set.remove(i);
        }
        double ans = sum / (double) total(N);
        System.out.printf("%.9f\n", ans);
    }
    private long total(int N) {
        long total = 1;
        while (0 < N) {
            total *= N;
            N -= 1;
        }
        return total;
    }
    private double dfs(double sum, int[] x, int[] y, int N, int done, int prev, HashSet<Integer> set) {
        if (N <= done) {
            return sum;
        }
        double result = 0;
        for (int i = 0; i < N; i++) {
            if (set.contains(i)) {
                continue;
            }
            set.add(i);
            double tx = Math.abs(x[prev]-x[i])*Math.abs(x[prev]-x[i]);
            double ty = Math.abs(y[prev]-y[i])*Math.abs(y[prev]-y[i]);
            result += dfs(sum+Math.sqrt(tx+ty), x, y, N, done+1, i, set);
            set.remove(i);
        }
        return result;
    }
}
