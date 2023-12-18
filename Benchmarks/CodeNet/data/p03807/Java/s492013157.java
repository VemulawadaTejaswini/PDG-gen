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
        int odd_count = 0;
        int even_count = 0;
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            if (x % 2 == 1) {
                odd_count += 1;
                continue;
            }
            even_count += 1;
        }
        even_count += odd_count / 2;
        int previous = 0;
        while (previous != even_count) {
            previous = even_count;
            even_count = even_count / 2 + even_count % 2;
        }
        odd_count %= 2;
        System.out.println(even_count + odd_count == 1 ? "YES" : "NO");
    }
}
