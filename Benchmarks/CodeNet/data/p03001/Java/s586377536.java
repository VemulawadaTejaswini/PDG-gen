import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double W = scan.nextDouble();
        double H = scan.nextDouble();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        if (is_corner(W, H, x, y)) {
            double area = (double) W * H / 2;
            System.out.println(area + " " + 0);
            return;
        }
        if (x == 0 || x == W) {
            double area1 = y * W;
            double area2 = (H - y) * W;
            double area = Math.min(area1,area2);
            System.out.println(area + " " + 0);
            return;
        }
        if (y == 0 || y == H) {
            double area1 = x * H;
            double area2 = (W - x) * H;
            double area = Math.min(area1,area2);
            System.out.println(area + " " + 0);
            return;
        }
        double area11 = x * H;
        double area12 = (W - x) * H;
        double area1 = Math.min(area11, area12);
        double area21 = y * W;
        double area22 = (H - y) * W;
        double area2 = Math.min(area21, area22);
        double area = Math.max(area1, area2);
        String multiple = area1 == area2 ? "1" : "0";
        System.out.println(area + " " + multiple);

    }
    public static boolean is_corner(double W, double H, double x, double y) {
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
