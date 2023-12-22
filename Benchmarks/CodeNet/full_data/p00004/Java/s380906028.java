import java.util.*;
import java.math.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static double a, b, c, d, e, f;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }
    static boolean read(){
        if(!sc.hasNext())
            return false;
        a = sc.nextDouble();
        b = sc.nextDouble();
        e = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        f = sc.nextDouble();
        return true;
    }
    static void solve(){
        double det = a*d - b*c;
        double x = (d*e - b*f)/det, y = (-c*e + a*f)/det;
        x = Math.floor(x*1000 + 0.5)/1000;
        y = Math.floor(y*1000 + 0.5)/1000;
        System.out.printf("%.3f %.3f\n", x, y);
    }
}