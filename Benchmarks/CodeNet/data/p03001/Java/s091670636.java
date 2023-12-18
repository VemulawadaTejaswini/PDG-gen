import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double ans1 = (double) W * H / 2;
        System.out.print(ans1 + " ");

        if ((W % 2 == 0) && (x == W / 2) && (H % 2 == 0) && (y == H / 2)) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
