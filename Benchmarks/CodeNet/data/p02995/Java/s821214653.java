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
        long A = nextLong();
        long B = nextLong();
        long C = nextLong();
        long D = nextLong();

        int count = 0;
        for(long i=A/C; C*i<=B; i++){
            if(A<=C*i){
                count++;
            }
        }
        for(long i=A/D; D*i<=B; i++){
            if(A<=D*i){
                count++;
            }
        }
        long lcm = lcm(C,D);
        for(long i=A/lcm; lcm*i<=B; i++){
            if(A<=lcm*i){
                count--;
            }
        }
        println(B-A-count+1);
    }
    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (c/b);
    }


    static Point[] nextArray(Point[] points){
        Point[] array = new Point[points.length-1];
        for(int i=0; i<array.length; i++){
            array[i] = points[i=1];
        }
        return array;
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
