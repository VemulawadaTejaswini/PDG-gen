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
        int m1 = scan.nextInt();
        int d1 = scan.nextInt();
        int m2 = scan.nextInt();
        int d2 = scan.nextInt();
        if (m1 != m2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
