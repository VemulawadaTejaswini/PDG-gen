import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double v = sc.nextDouble();
        double height = v / (a * a);
        double max = height* 2 - b;
        if(max >= 0){
            double rResult = (Math.PI/ 2) - Math.atan2(a, b-max);
            double result = rResult * 180.0 / Math.PI;
            System.out.println(result);
        }else{
            double p = 2 * v / ( a * b );
            double rResult = Math.atan2(b, p);
            double result = rResult * 180.0 / Math.PI;
            System.out.println(result);
        }
    }
}
