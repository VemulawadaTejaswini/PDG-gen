import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean hasNext(){return sc.hasNext();}
        static char[] mySplit(String str){return str.toCharArray();}
        public static void main(String[] args){
          long a = getLong();
          long b = getLong();
          long c = getLong();
          if(c - a - b < 0){
            myout("No");
            return;
          }
          if(4 * a * b < c - a - b){
            myout("Yes");
          }else{
            myout("No");
          }
        }
        //Method addition frame start

        //Method addition frame end
}
