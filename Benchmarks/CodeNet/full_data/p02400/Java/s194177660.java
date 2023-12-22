import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double r = scanner.nextDouble();
        double area = Math.PI * r * r;
        double around = 2 * Math.PI * r;
        System.out.println("" + String.format("%f", area) + " " + around);
    }
}
