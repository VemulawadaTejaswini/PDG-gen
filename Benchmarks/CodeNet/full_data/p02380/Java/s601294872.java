import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double area = a * b * Math.sin(Math.toRadians(c)) / 2;
        double h = b * Math.sin(Math.toRadians(c));
        double d = Math.sqrt(a*a + b * b - 2 * a * b * Math.cos(Math.toRadians(c)));

        System.out.println(area + " " + (d + a + b) + " " + h);
        scanner.close();
    }
}

