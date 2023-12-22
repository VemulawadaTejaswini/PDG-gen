import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static double a, b, c, d, e, f;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }
    static boolean read(){
        if(!sc.hasNext())return false;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();
        return true;
    }
    static void solve(){
        double det = a*e - b*d;
        double x = (c*e - b*f)/det, y = (-c*d + a*f)/det;
        if(x==0)x=0;
        if(y==0)y=0;
        System.out.printf("%.3f %.3f\n", x, y);
    }