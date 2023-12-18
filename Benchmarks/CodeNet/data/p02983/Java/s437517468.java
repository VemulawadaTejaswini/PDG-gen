import java.io.PrintWriter;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args){

        Long L = nextLong();
        Long R = nextLong();

        Long min = 2019L;
        for(Long i=L; i<=R; i++){
            for(Long j=i+1L; j<=R; j++){
                min = Math.min((i*j)%2019, min);
                if(min == 0) break;
            }
            if(min == 0) break;
        }

        println(min);
    }

    static int nextInt(){
        return Integer.parseInt(sc.next());
    }
    static Long nextLong(){
        return Long.parseLong(sc.next());
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
