import java.util.Scanner;

public class Main {
	 public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         double c = Math.toRadians(sc.nextDouble());
         double s = a * b * Math.sin(c) / 2;
         double l = (a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c)));
         double h = b * Math.sin(c);
         System.out.println(s);
         System.out.println(l);
         System.out.println(h);    
	 }
}

