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
        int K = nextInt();

        /*
        int R = nextInt();
        int S = nextInt();
        int P = nextInt();
         */

        int[] score = {nextInt(), nextInt(), nextInt()};

        char[] T = next().toCharArray();

        char[] a = {'p', 'r', 's'};

        char[] janken = new char[N];

        long ten = 0;
        for(int i=0; i<N; i++){
            char me = a[b(T[i])];
            if(i<K){
                ten += score[b(me)];
            }else{
                char no = janken[i-K];
                if(me == no){
                    janken[i] = 'a';
                    continue;
                }
                ten += score[b(me)];
            }
            janken[i] = me;
        }
        println(ten);
    }

    static int b(char a){
        if(a == 'r'){
            return 0;
        }
        if(a == 's'){
            return 1;
        }
        if(a == 'p'){
            return 2;
        }
        return -1;
    }

    static int c(char a){
        if(a == 'p'){
            return 0;
        }
        if(a == 'r'){
            return 1;
        }
        if(a == 's'){
            return 2;
        }
        return -1;
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
