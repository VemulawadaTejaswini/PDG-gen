import java.util.Scanner;

public class Main {

    static int X;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();

        solve();
    }

    static void solve() {
        System.out.println((int)Math.sqrt(X) * (int)Math.sqrt(X));
    }
}
