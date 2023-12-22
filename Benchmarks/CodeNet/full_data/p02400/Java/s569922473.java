
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double r = sc.nextDouble();
        double rr = 2 * r * Math.PI;
        double rrr = r * r * Math.PI;

        System.out.printf("%.10f %.10f\n",rrr,rr);

    }
}

