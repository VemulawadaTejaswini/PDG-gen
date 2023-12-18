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

    static String P = "";
    static String Q = "";
    static int countP = 0;
    static int countQ = 0;
    static boolean isP = false;
    static boolean isQ = false;
    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();

        if(a < b){
            for(int i=0; i<b; i++)
            {
                print(a);
            }
        }else{
            for(int i=0; i<a; i++)
            {
                print(b);
            }
        }
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
