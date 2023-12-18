
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long W = scanner.nextLong();
        long H = scanner.nextLong();
        long x = scanner.nextLong();
        long y = scanner.nextLong();

        if ((x == 0 && y == 0) || (x == 0 && y == H) || (x == W && y == 0) || (x == W && y == H)) {
            double tmp = H * (double)(W / 2);
            System.out.print(String.format("%.10f", tmp));
            System.out.print(" ");
            System.out.print(0);
            return;
        }


        double left = x * H;
        double right = (W - x) * H;
        double tmp;
        if (left > right) {
            tmp = right;
        } else {
            tmp = left;
        }

        double up = y * W;
        double down = (H - y) * W;
        double tmp2;
        if (up > down) {
            tmp2 = down;
        } else {
            tmp2 = up;
        }

        if (tmp == tmp2) {
            System.out.print(String.format("%.10f", tmp));
            System.out.print(" ");
            System.out.print(1);
        } else if (tmp > tmp2) {
            System.out.print(String.format("%.10f", tmp));
            System.out.print(" ");
            System.out.print(0);
        } else {
            System.out.print(String.format("%.10f", tmp2));
            System.out.print(" ");
            System.out.print(0);
        }
    }
}
