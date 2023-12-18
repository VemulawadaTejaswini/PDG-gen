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

        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = nextInt();
        }

        Arrays.sort(A);

        boolean flag = false;
        int before = A[0];
        int same = 0;
        int count = 0;
        if(N == 1){
            println(1);
            return;
        }
        for(int i=1; i<N; i++){
            if(before == A[i]){
                flag = !flag;
            }else{
                if(!flag){
                    count++;
                }
                flag = false;
            }
            before = A[i];
        }
        println(count);
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
