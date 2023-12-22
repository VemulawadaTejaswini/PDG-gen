import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        int a = Integer.parseInt(A);
        String B = scan.next();
        int b = Integer.parseInt(B);
        String H = scan.next();
        int h = Integer.parseInt(H);
        String M = scan.next();
        int m = Integer.parseInt(M);

        double cos = Math.cos(Math.toRadians(Math.abs(30 * h - 6 * m)));

        double ans = (a * a) + (b * b) - (2 * a * b * cos);
        ans = Math.sqrt(ans);

        System.out.println(ans);
    }
}