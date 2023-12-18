import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = Integer.parseInt(sc.next());
    long w = Integer.parseInt(sc.next());
    long a = Integer.parseInt(sc.next());
    long b = Integer.parseInt(sc.next());
    long mod = 1000000007l;
    
    long total = factorial(h+w-2l, h-1l, mod)*power(factorial(w-1l, 1l, mod), mod-2l, mod);
    long fbd = 0l;
    for(long i=h-a; i<=h-1l; i++){
      fbd -= factorial(i+b-1l, i, mod)*power(factorial(b-1l, 1l, mod), mod-2l, mod)%mod*factorial(w-b+h-i-1l, w-b, mod)*power(factorial(h-i-1l, 1l, mod), mod-2l, mod)%mod;
      fbd %= mod;
    }
    if(total+fbd < 0){
      fbd += mod;
    }
    
    System.out.println(total+fbd);
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
    long r = 1l;
    for(long i=start; stop<=i; i--){
      r *= i%mod;
      r %= mod;
    }
    return r;
  }
}