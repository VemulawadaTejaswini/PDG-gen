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
        double[] d = new double[N];
        for (int i = 0; i < N; i++) {
            d[i] = scan.nextDouble();
        }
        double avg = Arrays.stream(d).sum() / N;
        int ans = -1;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            double distance = Math.abs(avg-d[i]);
            if (distance < min) {
                min = distance;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
