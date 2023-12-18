import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    //a,bの最大公約数を素因数分解して出てきた素数の種類数+1が答え
    long c = gcd(a,b);
//    System.out.println(c);
    long answer = 0;
//    System.out.println(c);
    long tmp =0;
    for(long prime :primes(c)){
      if(tmp!=prime){
        if(isPrime(prime)){
//        System.out.println(prime);
// 素因数の約数のうち、素数or1だけカウントすべ
        answer = answer +1;
tmp=prime;
        }
      }
    }
    //なんで通らないケースあるんじゃーーーー
    System.out.println(answer);
  }
  
    //最大公約数
    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
  
//素因数分解してそいんすう列挙する
  static List<Long> primes(long c){ 
    List<Long> primenums= new ArrayList<Long>();
            long x = c;
            long y = x;
//       System.out.println(Math.floor(Math.sqrt(x))+2);
          for (long i = 1; i<=Math.sqrt(x); i++) {
//            System.out.println(i);
//            boolean divflg=false;
            if ((y % i) == 0 ) {
//               if(!divflg){
                primenums.add(i);
//               }
//                divflg=true;
            }
            
        }
    primenums.add(c);
    Collections.sort(primenums);
    return primenums;
  }
//素数判定
static boolean isPrime (long n) {
if (n==2||n==1) return true;
if (n%2==0) return false;
double d = Math.sqrt(n);
for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
 return true;
}
  
}
