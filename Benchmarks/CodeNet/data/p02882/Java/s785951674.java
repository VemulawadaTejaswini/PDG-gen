import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble(); 
 
        double v = a * a * b;
        double theta = 0.0;
        double rad = 0.0;
        if(x <= v / 2){
            rad = Math.atan((a * b*b) / (2 * x));
            theta = Math.toDegrees(rad);
        }
        if(x > v / 2){
            rad = Math.atan((2*v - 2*x) / (a*a*a));
            theta = Math.toDegrees(rad);
        }

        System.out.println(theta);
    }
}