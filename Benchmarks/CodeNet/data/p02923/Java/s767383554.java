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
        int[] H = new int[N];
        for(int i=0; i<N; i++){
            H[i] = nextInt();
        }

        int before = H[0];
        int count = 0;
        int max = 0;
        for(int i=1; i<N; i++){
            if(before >= H[i]){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(max, count);
            before = H[i];
        }
        println(max);
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
