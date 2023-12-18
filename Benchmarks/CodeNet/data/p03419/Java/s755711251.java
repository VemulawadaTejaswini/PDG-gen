import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static String[] mySplit(String str){return str.split("");}
        public static void main(String[] args){
          long N = getLong();
          long M = getLong();
  if(N == 2 || M == 2){
     myout(0);
  }else if(N == 1 || M == 1){
     if(N == M){
        myout(1);
     }else if(N == 1){
     	myout(M - 2);
     }else{
        myout(N - 2);
     }
  }else{
    myout((N-2)*(M-2));
  }
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
