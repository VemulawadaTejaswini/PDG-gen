import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer h = scanner.nextInt();
        Integer m = scanner.nextInt();

        double result;

        double angle = (h*360/12 + m*30/60) - m*360/60;

        result = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2*a*b*Math.cos(Math.toRadians(angle)));

        System.out.printf("%.20f",result);
    }
}
