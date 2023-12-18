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
        static String toKaigyo(String[] list){return String.join("\n",list);}
        static String toHanSp(String[] list){return String.join(" ",list);}
        public static void main(String[] args){
          long X = getLong();
          long first = 100;
          long output = 0;
          while(first < X){
            first = (long)Math.floor(first * 1.01);
            output++;
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
