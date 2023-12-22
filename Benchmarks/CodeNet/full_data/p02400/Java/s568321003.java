import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        String s = String.format("%.10f %.10f", a * a * Math.PI, a * 2 * Math.PI);
        System.out.println(s);
    }
}
