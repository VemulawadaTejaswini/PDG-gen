import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                long a = Long.parseLong(sc.next());
                long b = Long.parseLong(sc.next());
                int c = Integer.parseInt(sc.next());
                int d = Integer.parseInt(sc.next());
                sc.close();
                long cc = c;
                int dd = d;
                while(c % d != 0){
                        int e = c % d;
                        c = d;
                        d = e;
                }
                long s = cc * dd / d;
                a--;
                long yono = b - a - b / cc + a / cc - b / dd + a / dd + b / s - a / s;
                ou.print(yono + "\n");
                ou.flush();
        }
}