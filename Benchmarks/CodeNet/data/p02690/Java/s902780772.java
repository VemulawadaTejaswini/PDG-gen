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
        int ansX = 0;
        double ansB = 0;
        for(int i=-X; i<X; i++) {
            double B = -X + pow(i, 5);
            double T = Math.pow(B, 1.0/5.0);
            //println(T);
            if(Double.isNaN(T)){
                ansX = i;
                ansB = B;
            }else{
                break;
            }
            /*
            if (T == Math.floor(T) && !Double.isInfinite(T)) {
                println(i + " " + (int) B);
                return;
            }
             */
        }

        if(ansB >= 0) {
            for (int i =0; i < ansB; i++) {
                //println(i);
                if (Math.pow(i, 5) == (int) ansB) {
                    println(ansX + " " + i);
                    return;
                }
            }
        }else{
            for (int i = (int)ansB; i <= 0; i++) {
                //println(i);
                if (Math.pow(i, 5) == (int) ansB) {
                    println(ansX + " " + i);
                    return;
                }
            }
        }

        //println(ansX + " " + (int)ansB);
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
