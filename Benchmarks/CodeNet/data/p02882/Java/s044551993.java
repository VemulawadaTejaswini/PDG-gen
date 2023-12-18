import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        double h = (double)2*x/(a*b);
        if (h>a) {
            double h_2 = (double)2*b/a-(double)2*x/(double)a/(double)a/(double)a;
            // System.out.println("h_2: " + h_2);
            // System.out.println("tan: " + )
            System.out.println(Math.toDegrees(Math.atan(h_2)));
        } else {
            System.out.println(90-Math.toDegrees(Math.atan(h/b)));
        }
        // System.out.println("h: " + h);
        // long N = Long.parseLong(sc.next());
        // System.out.println(Math.atan(N));
        // System.out.println(Math.toDegrees(Math.atan(N)));
    }
}