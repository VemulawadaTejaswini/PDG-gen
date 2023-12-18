import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long W = scan.nextLong();
        long H = scan.nextLong();
        long x = scan.nextLong();
        long y = scan.nextLong();
        if (is_corner(W, H, x, y)) {
            double area = (double) W * H * 0.5;
            System.out.println(area + " " + 0);
            return;
        }
        if (x == 0 || x == W) {
            double area1 = (double) y * W;
            double area2 = (double) (H - y) * W;
            double area = Math.min(area1,area2);
            System.out.println(area + " " + 0);
            return;
        }
        if (y == 0 || y == H) {
            double area1 = (double) x * H;
            double area2 = (double) (W - x) * H;
            double area = Math.min(area1,area2);
            System.out.println(area + " " + 0);
            return;
        }
        double area11 = (double) x * H;
        double area12 = (double) (W - x) * H;
        double area1 = Math.min(area11, area12);
        double area21 = (double) y * W;
        double area22 = (double) (H - y) * W;
        double area2 = Math.min(area21, area22);
        double area = Math.max(area1, area2);
        String multiple = area1 == area2 ? "1" : "0";
        System.out.println(area + " " + multiple);

    }
    public static boolean is_corner(long W, long H, long x, long y) {
        if (x == 0 && y == 0) {
            return true;
        }
        if (x == 0 && y == H) {
            return true;
        }
        if (x == W && y == 0) {
            return true;
        }
        if (x == W && y == H) {
            return true;
        }
        return false;
    }
}
