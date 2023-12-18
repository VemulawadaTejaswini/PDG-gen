import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x2000 = sc.nextInt();

        int curX;
        int prevX = x2000;
        for (int i = 2001; i <= 2010; i++) {
            curX = r * prevX - D;
            System.out.println(curX);
            prevX = curX;
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}