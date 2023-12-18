import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static void myerr(Object t){System.err.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
          long Q = getLong();
          long H = getLong();
          long S = getLong();
          long D = getLong();
          long N = getLong();
          long output = 0;
          long tmpQ = Q*8;
          long tmpH = H*4;
          long tmpS = S*2;
          long tmp = Math.min(tmpQ,Math.min(tmpH,Math.min(tmpS,D)));
          output = tmp * (N / 2);
          if(N % 2 == 1){
            tmpQ = Q*4;
            tmpH = H*2;
            output += Math.min(tmpQ,Math.min(tmpH,S));
          }
          myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
