import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double l = Math.PI*(2*r);
        double S = Math.PI*r*r;

        System.out.println(l+" "+S);

    }
}