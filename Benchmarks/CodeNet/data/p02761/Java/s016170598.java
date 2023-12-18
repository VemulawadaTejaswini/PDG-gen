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

        int[] s = new int[M];
        int[] c = new int[M];

        for(int i=0; i<M; i++){
            s[i] = nextInt();
            c[i] = nextInt();
        }

        List<Integer> num = new ArrayList<>();
        for(int i=0; i<N; i++){
            num.add(-1);
        }

        for(int i=0; i<M; i++){
            if(num.get(s[i]-1) == -1 || num.get(s[i]-1) == c[i]) {
                num.remove(s[i] - 1);
                num.add(s[i] - 1, c[i]);
            }else{
                println(-1);
                return;
            }
        }

        if(N != 1 && num.get(0)==0){
            println(-1);
        }else{
            for(int i=0; i<N; i++){
                int number = Math.max(num.get(i), 0);
                if(N!= 1 && i == 0 && num.get(i) == -1) number = 1;
                print(number);
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
