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
          int N = getInt();
          while(!isPrime(N)){
            N++;
          }
          myout(N);
        }
        //便利メソッド追加枠ここから
static boolean isPrime(long val){
        if(val <= 1 || (val != 2 && val % 2 == 0)){
                return false;
        }else if(val == 2){
                return true;
        }
        double root = Math.floor(Math.sqrt(val));
        for(long i = 3; i <= root; i += 2){
                if(val % i == 0){
                        return false;
                }
        }
        return true;
}
        //便利メソッド追加枠ここまで
}
