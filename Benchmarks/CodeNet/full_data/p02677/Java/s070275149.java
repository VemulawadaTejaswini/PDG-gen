import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();

        double m1 = 6 * m;
        double h1 = 30 * h + 0.5 * m;
        double rc = Math.abs(m1 - h1);
        if(rc == 180 || rc == 0){
            System.out.println(0);
        }else{
            if(rc > 180){
                rc = 360 - rc;
            }
            double c = a * a + b * b;
            if(rc != 90){
                rc = Math.toRadians(rc);
                c = c - 2 * a * b * Math.cos(rc);
            }
            c = Math.sqrt(c);
            System.out.printf("%.20f",c);
        }
    }
}