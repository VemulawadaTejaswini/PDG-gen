import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c;
        if (b < 10) {
            c = a*10+b;
        } else if (b < 100) {
            c = a*100+b;
        } else {
            c = a*1000+b;
        }
        double d = Math.sqrt(c);
        if (Math.floor(d) < d) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}