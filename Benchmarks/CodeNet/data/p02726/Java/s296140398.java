import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int X = scan.nextInt()-1;
        int Y = scan.nextInt()-1;
        HashMap<Integer, Integer> dp = new HashMap<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int distance = Math.min(j - i, Math.min(Math.abs(i - X) + 1 + Math.abs(j - Y), Math.abs(j - X) + 1 + Math.abs(i - Y)));
                dp.merge(distance, 1, Integer::sum);
            }
        }
        for (int k = 1; k < N; k++) {
            System.out.println(dp.getOrDefault(k, 0));
        }
    }
}
