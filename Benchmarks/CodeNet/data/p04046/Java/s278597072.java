import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = Integer.parseInt(sc.next());
    long w = Integer.parseInt(sc.next());
    long a = Integer.parseInt(sc.next());
    long b = Integer.parseInt(sc.next());
    long mod = 1000000007l;
    
    long total = 0l;
    for(long i=b; i<w; i++){
      total += factorial(i+h-a-1l, i, mod)*power(factorial(h-a-1l, 1l, mod), mod-2l, mod)%mod
        *factorial(-i+w-2l+a, a-1l, mod)*power(factorial(w-1l-i, 1l, mod), mod-2l, mod)%mod;
      total %= mod;
    }
    System.out.println(total);
  }
  
  private static long power(long n, long pow, long mod){
    long now_pow = 1l;
    long now = n%mod;
    long save = 1l;
    while(true){
      if(pow == 1l){
        return save*now%mod;
      }else if(now_pow*2l < pow){
        now *= now;
        now %= mod;
        now_pow *= 2l;
      }else if(now_pow*2l == pow){
        now *= now;
        now %= mod;
        return save*now%mod;
      }else{
        save *= now;
        save %= mod;
        now = n;
        now %= mod;
        pow -= now_pow;
        now_pow = 1l;
      }
    }
  }
  
  private static long factorial(long start, long stop, long mod){
    if(start == 0l){
      return 1l;
    }
    long r = 1l;
    for(long i=start; stop<i; i--){
      r *= i%mod;
      r %= mod;
    }
    return r;
  }
}