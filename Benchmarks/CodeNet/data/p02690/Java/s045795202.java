import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int x = in.nextInt();
        for (int i = -x; i < x; i++) {
            double x1 = x + Math.pow(i, 5);
            double power = isPower(x1, 5);
            if (Double.compare(x1, Math.pow(power, 5)) == 0) {
                System.out.println(i + " " + (int) power);
                break;
            }
        }
    }

    static long isPower(double x, int y) {
        return Math.round(Math.pow(x, 1.0 / y));
    }
}
