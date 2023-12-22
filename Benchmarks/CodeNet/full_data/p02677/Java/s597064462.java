import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double h = 30 * (H + M/60.0);
        double m = M * 6.0;
        double k = Math.abs(m - h);
        double cos = Math.cos(Math.toRadians(k));
        double a = A*A + B*B - (2*A*B*cos);
        System.out.println(Math.sqrt(a));
    }

}