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
        double area = ((double) W * H) / 2;
        if (is_corner(W, H, x, y)) {
            System.out.println(String.format("%.10f",area) + " " + 0);
            return;
        }
        if (x == 0 || x == W) {
            System.out.println(String.format("%.10f",area) + " " + 0);
            return;
        }
        if (y == 0 || y == H) {
            System.out.println(String.format("%.10f",area) + " " + 0);
            return;
        }
        System.out.println(String.format("%.10f",area) + " " + 1);

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
