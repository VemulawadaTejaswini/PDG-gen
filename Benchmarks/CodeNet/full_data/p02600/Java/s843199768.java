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
        if (400 <= X && X <= 599) {
            System.out.println(8);
            return;
        }
        if (X <= 799) {
            System.out.println(7);
            return;
        }
        if (X <= 999) {
            System.out.println(6);
            return;
        }
        if (X <= 1199) {
            System.out.println(5);
            return;
        }
        if (X <= 1399) {
            System.out.println(4);
            return;
        }
        if (X <= 1599) {
            System.out.println(3);
            return;
        }
        if (X <= 1799) {
            System.out.println(2);
            return;
        }
        if (X <= 1999) {
            System.out.println(1);
            return;
        }
    }
}
