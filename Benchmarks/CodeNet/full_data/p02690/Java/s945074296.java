import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var x = scanner.nextLong();

        var amax = (long) Math.pow( x+0.9, 0.2 );
        for(long a = 1; a <= amax; a++) {
            var b = longPow(x - a*a*a*a*a, 0.2);
            // System.out.println("# " + a + " " + (-b));
            if(a*a*a*a*a + b*b*b*b*b == x) {
                System.out.println(a + " " + (-b));
                System.exit(0);
            }
        }

        var bmax = (long) Math.pow( (x/5)+0.9, 0.25 );
        for(long b = 0; b <= bmax; b++) {
            var a = longPow(x + b*b*b*b*b, 0.2);
            // System.out.println("% " + a + " " + b);
            if(a*a*a*a*a - b*b*b*b*b == x) {
                System.out.println(a + " " + b);
                System.exit(0);
            }
        }
    }

    static long longPow(long x, double p) {
        assert x >= 0;
        return (long) Math.pow(x+0.9, p);
    }
}
