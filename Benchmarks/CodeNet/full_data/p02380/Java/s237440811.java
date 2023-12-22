import java.util.Scanner;

public class Main{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        double a = s.nextDouble(), b = sc.nextDouble(); angle = sc.nextDouble();
        double c = Math.toRadians(angle);
        
        int s = a * b * Math.sin(c) / 2;
        int l = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c));
        int h = b * Math.sin(c);
        
        System.out.println(s);
        System.out.println(l);
        System.out.println(h);
    }
}
