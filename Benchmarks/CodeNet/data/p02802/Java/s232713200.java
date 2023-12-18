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
        int N = nextInt();
        int M = nextInt();
        Set<Integer> set = new HashSet<>();
        int ac = 0;
        int pena = 0;
        for(int i=0; i<M; i++){
            Integer p = nextInt();
            String S = next();
            if(!set.contains(p)){
                if(S.equals("AC")){
                    set.add(p);
                    ac++;
                }else{
                    pena++;
                }
            }
        }
        println(ac + " " + pena);
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
