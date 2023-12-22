import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var x = scanner.nextLong();
        var amax = (long) Math.pow( x+0.9, 0.2 );
        for(long a = 1; a <= amax; a++) {
            var b = fact(x - a*a*a*a*a, 5);
            if(b >= 0) {
                System.out.println(a + " " + (-b));
                System.exit(0);
            }
        }
        var bmax = (long) Math.pow( (x/5)+0.9, 0.25 );
        for(long b = 0; b <= bmax; b++) {
            var a = fact(x + b*b*b*b*b, 5);
            if(a > 0) {
                System.out.println(a + " " + b);
                System.exit(0);
            }
        }
    }

    static int fact(long x, int p) {
        assert x >= 0;
        var f = (long) Math.exp(x+0.9, (double) p);
        if(f*f*f*f*f != x) f = -1L;
        return (int) f;
    }
}
