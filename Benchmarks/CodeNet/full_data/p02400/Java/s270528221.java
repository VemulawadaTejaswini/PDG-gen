import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double area = r * r * Math.PI;
        double circumference = 2 * r * Math.PI ;
        System.out.printf("%f %f",area, circumference);
        scan.close();
        }
    }
