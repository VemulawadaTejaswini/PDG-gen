import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static Long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static char[] splitSingle(String str){return str.toCharArray();}
        public static void main(String[] args){
          int N = getInt();
          int T = getInt();
          int[] list = new int[N];
          for(int i = 0; i < N; i++){
            list[i] = getInt();
          }
          long output = 0;
          for(int i = 1; i < N; i++){
            if(list[i] - list[i-1] > T){
              output += T;
            }else{
              output += list[i] - list[i-1];
            }
          }
          output += T;
          myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
