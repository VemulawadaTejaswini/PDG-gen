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
        long Y = scan.nextInt();
        if (Y % X == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(X);
    }
}
