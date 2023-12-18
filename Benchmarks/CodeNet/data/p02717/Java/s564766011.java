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
        int Z = scan.nextInt();
        int t = X;
        X = Y;
        Y = t;
        t = X;
        X = Z;
        Z = t;
        System.out.printf("%d %d %d\n", X, Y, Z);

    }
}
