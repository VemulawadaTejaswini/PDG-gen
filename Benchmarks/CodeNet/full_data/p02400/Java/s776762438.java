import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double pi = Math.PI;                                           

        double area = r * r * pi;
        double circumference = r * 2 * pi;

        out.printf("%f %f%n", area, circumference);
    }
}