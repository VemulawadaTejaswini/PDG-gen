import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r;
        r = (double)sc.nextInt();
        double a,b;
        a = (double)(r * r * Math.PI);
        b = (double)(2 * r * Math.PI);
        System.out.printf("%.6f %.6f", a, b);
    }
}
