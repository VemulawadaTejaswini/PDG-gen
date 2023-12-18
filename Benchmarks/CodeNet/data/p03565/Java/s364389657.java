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
        char[] S = next().toCharArray();
        char[] T = next().toCharArray();

        int count = 0;
        boolean flag = false;
        for(int i=S.length-1; i>=0; i--){
            if(S[i] == '?'){
                count++;
            }
            else if(count < S.length && T[T.length-count-1] == S[i]){
                count++;
            }

            if(count >= T.length){
                for(int j=0; j<T.length; j++) {
                    S[i + j] = T[j];
                }
                flag = true;
                break;
            }

            if(S[i] != '?'){
                count = 0;
            }
        }

        if(!flag){
            println("UNRESTORABLE");
            return;
        }
        for(int i=0; i<S.length; i++){
            print(S[i] == '?' ? "a" : S[i]);
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
