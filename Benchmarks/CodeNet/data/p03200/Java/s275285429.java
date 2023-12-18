import java.io.PrintWriter;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args){
        String[] str = next().split("");

        Long count = 0L;
        Long w = 0L;
        for(int i=0; i<str.length; i++){
            if(str[i].equals("W")){
                count += i-w;
                w++;
            }
        }

        println(count);
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
