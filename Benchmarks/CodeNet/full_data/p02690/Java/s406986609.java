import javax.print.DocFlavor;
import java.awt.*;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.List;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int X = nextInt();
        for(int i=0; i<X; i++) {
            double B = -X + pow(i, 5);
            if (B == Math.floor(B) && !Double.isInfinite(B)) {
                println(i + " " + (int) B);
                return;
            }
        }
    }

    public static final double pow(double v, int n){
        double vv = v;
        for (int i = 1; i < n; i++) {
            vv *= v;
        }

        return vv;
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static Long nextLong() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static void print(Object o) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(o);
        out.flush();
    }
}
