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
        int K = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        boolean found = false;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
