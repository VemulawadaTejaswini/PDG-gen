import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 2001; i <= 2010; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}