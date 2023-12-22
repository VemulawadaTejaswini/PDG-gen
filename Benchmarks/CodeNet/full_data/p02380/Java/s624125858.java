import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), angle = sc.nextDouble();
        double c = Math.toRadians(angle);
        
        double s = a * b * Math.sin(c) / 2;
        double l = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c));
        double h = b * Math.sin(c);
        
        System.out.println(s);
        System.out.println(l);
        System.out.println(h);
    }
}
