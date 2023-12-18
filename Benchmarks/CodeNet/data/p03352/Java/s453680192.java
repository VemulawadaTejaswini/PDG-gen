import java.util.Scanner;

public class Main {

    static int X;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();

        solve();
    }

    static void solve() {
        int MAX_ROOT = (int)Math.sqrt(X);

        int max = 1;
        for (int i = 2; i <= MAX_ROOT; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((int)Math.pow(i, j) > X) {
                    break;
                }
                max = Math.max((int)Math.pow(i, j), max);
            }
        }
        System.out.println(max);
    }
}
