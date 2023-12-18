import java.util.*;
import java.math.*;
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
          int N = getInt();
          ArrayList<BigInteger> list = new ArrayList<BigInteger>(N);
          BigInteger outlcm = new BigInteger("1");
          for(int i = 0; i < N; i++){
            list.add(new BigInteger(getStr()));
            BigInteger gcd = outlcm.gcd(list.get(i));
            BigInteger multi = outlcm.multiply(list.get(i));
            outlcm = multi.divide(gcd);
          }
          //myout(outlcm);
          BigInteger output = new BigInteger("0");
          BigInteger mod = new BigInteger("1000000007");
          for(int i = 0; i < N; i++){
            output = output.add(outlcm.divide(list.get(i))).mod(mod);
          }
          myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
