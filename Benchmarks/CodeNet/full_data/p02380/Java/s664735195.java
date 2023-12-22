import java.util.Scanner;
public class Main {
    public static void main(String[] $) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int C = sc.nextInt();
       double Cc = C * Math.PI /180;
       System.out.println(b * Math.sin(Cc) * a /2);
       System.out.println(Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Cc)) + a + b);
       System.out.println(b * Math.sin(Cc));
    }
}
