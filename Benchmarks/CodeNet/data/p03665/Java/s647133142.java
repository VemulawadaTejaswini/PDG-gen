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
          int P = getInt();
            boolean isOdd = false;
            for(int i = 0; i < N; i++){
              int a = getInt();
              if(a % 2 == 1){
                isOdd = true;
              }
            }
            if(isOdd){
              myout(originPow(new Long(2),N - 1));
            }else{
              if(P == 0){
                myout(originPow(new Long(2),N));
              }else{
                myout(0);
              }
            }
          
        }
        //Method addition frame start
static long originPow(long x, long n) {return originPow(x,n,-1);}
static long originPow(long x, long n,int m) {
        long ans = 1;
        while (n > 0) {
                if ((n & 1) == 1){
                  ans = ans * x;
                  if(m != -1){ans %= m;}
                }
                x = x * x;
          		if(m != -1){x %= m;}
                n >>= 1;
        }
        return ans;
}
        //Method addition frame end
}
