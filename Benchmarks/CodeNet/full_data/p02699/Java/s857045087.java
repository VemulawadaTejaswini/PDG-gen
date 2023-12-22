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
        int S = scan.nextInt();
        int W = scan.nextInt();
        if (W < S) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}
