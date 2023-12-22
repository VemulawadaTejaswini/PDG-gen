import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r = new Scanner(System.in).nextInt();

        double area = r * r * Math.PI;
        double circumference = r * 2 * Math.PI;                        

        out.printf("%f %f%n", area, circumference);
    }
}