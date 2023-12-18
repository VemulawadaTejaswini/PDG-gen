import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                long a = Long.parseLong(sc.next());
                long b = Long.parseLong(sc.next());
                int c = Integer.parseInt(sc.next());
                int d = Integer.parseInt(sc.next());
                sc.close();
                int cc = c;
                int dd = d;
                long s = 1;
                for(int i = 2 ; i <= c ; i++){
                        if(c % i == 0 && d % i == 0){
                                s *= i;
                                c /= i;
                                d /= i;
                                i--;
                        }
                }
                s *= c * (long)d;
                long yono = 1;
                yono += b - a;
                a--;
                yono -= b / cc - a / cc;
                yono -= b / dd - a / dd;
                yono += b / s - a / s;
                ou.print(yono + "\n");
                ou.flush();
        }
}