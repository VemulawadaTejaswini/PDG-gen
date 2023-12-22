import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = Math.PI;
        double area = PI*r*r;
        double length = 2*PI*r;
        System.out.printf("%f %f", area, length);
    }
}
