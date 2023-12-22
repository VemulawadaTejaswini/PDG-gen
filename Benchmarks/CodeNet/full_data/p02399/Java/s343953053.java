
import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double d = 1.0 * a/b;
        System.out.println(a/b + " " + a%b + " " + String.format("%.5f", d));
    }
}