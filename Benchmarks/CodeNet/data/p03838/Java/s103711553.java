import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x = scan.nextInt();
        int y = scan.nextInt();
        int ax = Math.abs(x);
        int ay = Math.abs(y);
        int answer = Integer.MAX_VALUE;
        if (x * y < 0) {
            System.out.println(Math.abs(ay - ax) + 1);
            return;
        }
        if (x <= y) {
            System.out.println(y - x);
            return;
        }
        System.out.println(Math.abs(y - x) + 2);
    }
}
