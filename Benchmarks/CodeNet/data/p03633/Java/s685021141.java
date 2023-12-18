import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
          int N = getInt();
          long output = getLong();
          while(isNext()){
            output = lcm(getLong(),output);
          }
          myout(output);
          
          //myout(lcm(10,new Long("1000000000000000000")));
          //myout(gcd(10,new Long("1000000000000000000")));
        }
        //便利メソッド追加枠ここから
public static long lcm(long m, long n) {return Math.max(m,n) / gcd(m, n) * Math.min(m,n);}
  public static long gcd(long m, long n) {return n != 0 ? gcd(n, m % n) : m;}
        //便利メソッド追加枠ここまで
}
