import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double r = 0;
        double circle_area = 0.0;
        double circumference = 0.0;

        double pi = Math.PI;

        Scanner sc= new Scanner(System.in);

        r = sc.nextDouble();

        circle_area = pi * r * r;
        circumference = 2 * pi * r;


        System.out.println( circle_area + " " + circumference);
        sc.close();
    }
}
