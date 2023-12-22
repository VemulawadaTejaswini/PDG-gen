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
        for (int i = 0; i <= X; i++) {
            int total = i * 2 + (X - i) * 4;
            if (total == Y) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
