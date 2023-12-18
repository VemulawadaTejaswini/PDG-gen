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
  long A = getLong();
          long B = getLong();
  if(A == B){
     myout(A);
    return;
  }
  if(A % 2 == 1 && B % 2 == 0){
     long center = (B - A - 1) / 2;
    myout(A ^ B ^ (center % 2));
  }else if(A % 2 == 1 && B % 2 == 1){
     long center = (B - A) / 2;
    myout(A ^ (center % 2));
  }else if(A % 2 == 0 && B % 2 == 0){
    long center = (B - A) / 2;
    myout(B ^ (center % 2));
  }else{
    long center = (B - A + 1) / 2;
    myout(center % 2);
  }
        }
        //Method addition frame start

        //Method addition frame end
}
