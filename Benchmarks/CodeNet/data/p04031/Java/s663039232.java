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
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = scan.nextInt();
        }
        Arrays.sort(d);
        int ans = Integer.MAX_VALUE;
        for (int i = d[0]; i <= d[N-1]; i++) {
            int cost = 0;
            for (int j = 0; j < N; j++) {
                cost += (d[j] - i) * (d[j] - i);
            }
            ans = Math.min(ans,cost);
        }
        System.out.println(ans);
    }
}
