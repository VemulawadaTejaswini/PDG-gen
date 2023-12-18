import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long ans;
        long count = B - A + 1;
        if (count % 2 == 0) {
            if (count % 4 == 0) {
                ans = 0;
            }
            else {
                ans = 1;
            }
        }
        else {
            if ((count - 1) % 4 == 0) {
                ans = B;
            }
            else {
                ans = 1 ^ B;
            }
        }
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
