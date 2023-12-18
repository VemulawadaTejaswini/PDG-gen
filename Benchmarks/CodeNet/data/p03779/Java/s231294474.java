
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        for (int i = 0; i <= X; i++) {
            if ((i * (i + 1)) / 2 >= X) {
                System.out.println(i);
                return;
            }
        }
    }
}