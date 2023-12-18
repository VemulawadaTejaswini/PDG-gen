import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double S = x/a;
        double h = (a*b-S)*2/a;
        double w = S*2/b;

        if(S>=a*b/2) System.out.println(Math.toDegrees(Math.atan(h/a)));
        else System.out.println(Math.toDegrees(Math.atan(b/w)));
    }
}
