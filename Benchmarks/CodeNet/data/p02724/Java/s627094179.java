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
        long X = scan.nextInt();
        long c1 = X / 500;
        long remain = X - c1 * 500;
        long c2 = remain / 5;
        long ans = c1 * 1000 + c2 * 5;
        System.out.println(ans);
    }
}
