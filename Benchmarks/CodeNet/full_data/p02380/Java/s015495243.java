import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[]{sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
        System.out.println(a[0] * a[1] * Math.sin((Math.PI / 180) * a[2]) / 2.0);
        System.out.println(
            a[0] + a[1] + Math.sqrt(a[0] * a[0] + a[1] * a[1] - 2 * a[0] * a[1] * Math.cos(Math.PI / 180 * a[2])));
        System.out.println(a[1] * Math.sin(Math.PI / 180 * a[2]));
    }
}
