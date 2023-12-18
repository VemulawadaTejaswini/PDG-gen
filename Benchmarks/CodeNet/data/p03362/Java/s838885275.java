import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 5; N > 0; i++) {
            if (i % 5 == 1) {
                System.out.print(i + " ");
                N--;
            }
        }
    }
}