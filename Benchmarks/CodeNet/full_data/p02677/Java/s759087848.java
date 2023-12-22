import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final double pi = 3.14159265358979323846;
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double H = sc.nextDouble();
        double M = sc.nextDouble();

        double dist = A*A + B*B - A*B*Math.cos(2*pi*(M/60 - (H*60+M)/720))*2;

        System.out.println(Math.sqrt(dist));
    }
}
