import java.io.PrintWriter;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int M = nextInt();
        int D = nextInt();

        int count = 0;
        for(int i=1; i<=M; i++){
            for(int j=1; j<=D; j++){
                int d10 = j/10;
                int d1 = j-d10*10;
                if(d10>=2 && d1 >= 2 && d10*d1 == i) count++;
            }
        }

        println(count);
    }

    //最小公倍数lcm
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
