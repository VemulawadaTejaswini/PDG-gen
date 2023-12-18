import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = a + b;

        if (ans < 10) {
            System.out.println(ans);
        } else {
            System.out.println("error");
        }
    }
}
