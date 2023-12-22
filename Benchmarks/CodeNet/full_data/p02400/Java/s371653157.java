import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159265359;
        double r = scanner.nextInt();

        System.out.printf("%f %f", r*r*PI, 2*PI*r);

        scanner.close();
    }
}
