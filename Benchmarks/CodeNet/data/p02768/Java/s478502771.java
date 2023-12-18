import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean hasNext(){return sc.hasNext();}
        static char[] mySplit(String str){return str.toCharArray();}
        public static void main(String[] args){
          int N = getInt();
          int A = getInt();
          int B = getInt();
          if(N == 2){
            myout(0);
            return;
          }
          int mod = 1000000007;
          int aResult = originComb(N,A,mod);
          int bResult = originComb(N,B,mod);
          int output = ((int)(N * N + 1)%mod) - aResult - bResult;
          if(output < 0){
            output += mod;
          }
          myout(output);
        }
        //Method addition frame start
static int originComb(int n, int k, int m){
  int[] numerator = new int[k];
  int[] denominator = new int[k];
  for(int i = 0; i < k; i++){
    numerator[i] = n - k + i + 1;
    denominator[i] = i + 1;
  }
  for(int i = 2; i <= k; i++){
    int pivot = denominator[i - 1];
    if(pivot > 1){
      int offset = (n - k) % i;
      for(int j = i - 1; j < k; j += i){
        numerator[j - offset] /= pivot;
        denominator[j] /= pivot;
      }
    }
  }
  int res = 1;
  for(int i = 0; i < k; i++){
    if(numerator[i] > 1){
      res = res * numerator[i] % m;
    }
  }
  return res;
}
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
