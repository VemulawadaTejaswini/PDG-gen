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
        int N = nextInt();

        String T = "";

        for(int i=0; i<N; i++){
            P += next();
            T += i+1;
        }
        for(int i=0; i<N; i++){
            Q += next();
        }

        permutation(T, "");
        println(Math.abs(countP-countQ));
    }

    public static void permutation(String q, String ans){
        if(isP && isQ) return;
        // Base Case
        if(q.length() <= 1) {
           if(!isP)countP++;
           if(!isQ)countQ++;
           if(P.equals(ans + q)){
               isP = true;
           }
           if(Q.equals(ans + q)){
               isQ = true;
           }
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
                if(isP && isQ) return;
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
