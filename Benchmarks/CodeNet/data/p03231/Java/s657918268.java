import java.io.PrintWriter;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args){
        int N = nextInt();
        int M = nextInt();

        String[] S = next().split("");
        String[] T = next().split("");

        long L = lcm(N, M);

        HashMap<Long, String> map = new HashMap<>();
        for(int i=0; i<N; i++){
            long indexS  = i==0 ? 0 : i*L/N + 1;
            map.put(indexS, S[i]);
        }

        for(int i=0; i<M; i++){
            long indexT = i==0 ? 0 : i*L/M + 1;

            if(!(!map.containsKey(indexT) || map.get(indexT).equals(T[i]))){
                L = -1;
                break;
            }
        }

        println(L);
    }

    //最大公約数gcd
    static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
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
    static int nextInt(){
        return Integer.parseInt(next());
    }
    static Long nextLong(){
        return Long.parseLong(next());
    }
    static String next(){
        return sc.next();
    }
    static void println(Object o){
        PrintWriter out = new PrintWriter(System.out);
        out.println(o);
        out.flush();
    }
   static void print(Object o){
       PrintWriter out = new PrintWriter(System.out);
       out.print(o);
       out.flush();
    }
}
