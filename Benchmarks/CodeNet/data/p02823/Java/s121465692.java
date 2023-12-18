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
  long N = getLong();
          long A = getLong();
          long B = getLong();
  
  
  long output = 0;
  if((A - B) % 2 == 0){
     myout((B-A)/2);
     }else{
     if(A-1 < N - B){
        output = A;
       B = B - A;
       A = 1;
       output += (B-A)/2;
        }else{
       output = N-B+1;
       A = A + (N-B+1);
          B = N;
       output += (B-A)/2;
        }
       myout(output);
     }
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
