import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        if (D == 0) {
            System.out.println(N);
        } else if (D == 1) {
            System.out.println(N * 100);
        } else if (D == 2) {
            System.out.println(N * 10000);
        } else {
            System.out.println(N * 1000000);
        }
    }
}