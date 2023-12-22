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
        char x = scan.next().toCharArray()[0];
        if ('A' <= x && x <= 'Z') {
            System.out.println("A");
            return;
        }
        System.out.println("a");
    }
}
