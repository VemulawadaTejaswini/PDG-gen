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

        int[] L = new int[N];
        Arrays.setAll(L,i->nextInt());

        Arrays.sort(L);

        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int m=j+1; m<N && L[m]<L[i]+L[j]; m++){
                    count++;
                }
            }
        }
        println(count);
    }

    static long a(long n){
        return n < 2L ? 1L : n*a(n-2);
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
