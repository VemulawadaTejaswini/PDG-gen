import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static void myerr(Object t){System.err.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        static char[] splitSingle(String str){return str.toCharArray();}
        public static void main(String[] args){
          long A = getLong();
          long B = getLong();
          long C = getLong();
          if(A % 2 == 0 || B % 2 == 0  || C % 2 == 0){
            myout(0);
            return;
          }else{
            myout(Math.min(A*B,Math.min(A*C,B*C)));
          }
          
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
