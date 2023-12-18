import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    //a,bの最大公約数を素因数分解して出てきた素数の個数+1が答え
    long c = gcd(a,b);
//    System.out.println(c);
    long answer = 0;
//    System.out.println(c);
    answer = 1;
    long tmp =0;
    for(long prime :primes(c)){
      if(tmp!=prime){
        if(isPrime(prime)){
//        System.out.println(prime);
        answer = answer +1;
        }
      }
      tmp=prime;
    }
    
    System.out.println(answer);
  }
  
    //最大公約数・最小公倍数（セットで使う）
    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
  
//素因数分解
  static List<Long> primes(long c){ 
    List<Long> primenums= new ArrayList<Long>();
            long x = c;
            long y = x;
//       System.out.println(Math.floor(Math.sqrt(x))+2);
          for (double i = 2; i<= Math.floor(Math.sqrt(x))*2; i++) {
//            System.out.println(i);
//            boolean divflg=false;
            if ((y % i) == 0 ) {
//               if(!divflg){
                primenums.add(i);
//               }
//                divflg=true;
            }
            
        }
    Collections.sort(primenums);
    return primenums;
  }
//素数判定
static boolean isPrime (long n) {
if (n==2) return true;
if (n<2 || n%2==0) return false;
double d = Math.sqrt(n);
for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
 return true;
}
  
}