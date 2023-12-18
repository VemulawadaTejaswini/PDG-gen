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
          int N = getInt();
          long A = getLong();
          long B = getLong();
          long output = 0;
          long mae = getLong();
          for(int i = 0; i < N - 1; i++){
            long x = getLong();
            long kyori = x - mae;
            if(kyori * A > B){
              output += B;
            }else{
              output += kyori * A;
            }
            mae = x;
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
