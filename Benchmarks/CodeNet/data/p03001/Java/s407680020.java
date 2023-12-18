import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = Long.parseLong(sc.next());
        long h = Long.parseLong(sc.next());
        long x = Long.parseLong(sc.next());
        long y = Long.parseLong(sc.next());
        double ans = 0;
        int hukusu = 0;
        if(2*x == w && 2*y == h) {
            ans = (double)x*(double)h;
            hukusu = 1;
        }else if(2*x == w || 2*y == h) {
            ans = (double)(x*h);
            hukusu = 0;
        }else {
            long x2 = w/2;//w-x;
            long y2 = h/2;//h-y;
            double a = (double)((y2-y)/(x2-x));
            double t = (double)(y - a*x);
            if((-t)/a >= 0 && (-t)/a <= 0) ans = (((-t)/a) + (w - ((-t)/a))) * h / 2;
            else ans = (t + (h - t)) * w / 2;
        }
        System.out.println(ans+" "+hukusu);
    }
}