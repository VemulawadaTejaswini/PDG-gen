import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        double a = 360*H/12 + (double)360*M/(12*60);
        double b = 360*M/60;

        double r;
        if (Math.abs(a-b) > 180) {
            r = 360-Math.abs(a-b);
        } else {
            r = Math.abs(a-b);
        }
        //System.out.println(r);
        double rd = Math.toRadians(r);
        double xx = A*A+B*B-2*A*B*Math.cos(rd);
        System.out.println(Math.sqrt(xx));
    }
}
