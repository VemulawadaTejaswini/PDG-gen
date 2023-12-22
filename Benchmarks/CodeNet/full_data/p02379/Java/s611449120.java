
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double a;
        double b;

        a = x2 - x1;
        b = y2 - y1;
        double c = Math.sqrt(a * a + b * b);
        System.out.printf("% 8f", c);
    }

}

