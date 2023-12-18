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
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int ans = 0;
        if (X == 1) {
            ans += 300000;
        }
        if (Y == 1) {
            ans += 300000;
        }
        if (X == 2) {
            ans += 200000;
        }
        if (Y == 2) {
            ans += 200000;
        }
        if (X == 3) {
            ans += 100000;
        }
        if (Y == 3) {
            ans += 100000;
        }
        if (X == 1 && Y == 1) {
            ans += 400000;
        }
        System.out.println(ans);
    }
}
