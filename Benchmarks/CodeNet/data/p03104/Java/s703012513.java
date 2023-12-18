import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long ans = A;
        for (long x = (A+1); x <= B; x++) {
            ans = ans ^ x;
        }
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
