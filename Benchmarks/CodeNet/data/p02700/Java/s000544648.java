import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        if (a == 0 && d != 0)
            System.out.println("No");
        else if (c == 0 && d != 0)
            System.out.println("Yes");
        else {
            int x = a % c;
            int y = d % b;

            System.out.println((x > y) ? "Yes" : "No");
        }

    }
}
