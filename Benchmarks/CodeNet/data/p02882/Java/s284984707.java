import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();

        //double d = Math.toDegrees(Math.atan(2.0 * (x - a * a * b) / (a * a * a)));
        //double d2 = Math.toDegrees(Math.atan((a * b * b) / (2 * x)));

        if(x >= a * a * b / 2) System.out.println(Math.abs(Math.toDegrees(Math.atan(2.0 * (x - a * a * b) / (a * a * a)))));
        else System.out.println(Math.abs(Math.toDegrees(Math.atan((a * b * b) / (2 * x)))));


    }

}
