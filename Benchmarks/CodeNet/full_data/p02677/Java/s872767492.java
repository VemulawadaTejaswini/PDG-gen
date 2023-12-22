import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = -Math.toRadians(sc.nextInt())*30;
        double m = -Math.toRadians(sc.nextInt())*6;
        double x = Math.cos(h)*a-Math.cos(m)*b;
        double y = Math.sin(h)*a-Math.sin(m)*b;
        System.out.println(Math.sqrt(x*x+y*y));
    }


}
