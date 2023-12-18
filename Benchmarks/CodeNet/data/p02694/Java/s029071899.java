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
        long X = scan.nextLong();
        long current = 100;
        long ans = 0;
        while (current < X) {
            ans += 1;
            current = (long) Math.floor(current * 1.01);
        }
        System.out.println(ans);
    }
}
