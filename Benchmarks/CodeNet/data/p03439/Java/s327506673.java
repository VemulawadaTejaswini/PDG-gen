import java.util.*;
public class Main {
        
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        /*static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}*/
        static String[] mySplit(String str){return str.split("");}
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          int count = 0;
          while(true){
            myout(count);
            count++;
            sc = new Scanner(System.in);
            String res = sc.next();
            if("Vacant".equals(res)){
              return;
            }
          }
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
