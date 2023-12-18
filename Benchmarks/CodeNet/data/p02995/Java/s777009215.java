import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A =sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
    long LCM = lcm(C,D);
    long answer = 0;
    answer = B-A+1;
    answer = answer -(B/C)+((A-1)/C);
    answer = answer -(B/D)+((A-1)/D);
    answer = answer + ((B/LCM)-((A-1)/LCM));
    System.out.println(answer);
       
  }
  
  //最大公約数・最小公倍数（セットで使う）
  static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
  static long lcm (long a, long b) {return a*b/gcd(a,b);}
}