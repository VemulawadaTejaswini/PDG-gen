import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  long A = sc.nextLong();
	  long B = sc.nextLong();
	  long C = sc.nextLong();
	  long D = sc.nextLong();
	  

	 A--;
	  //A-1までの対象の数の数を求める
	  long c = A/C;
	  long d = A/D;
	  long cANDd = A / lcm(C,D);
	  long a = A - (c + d - cANDd);
	  
	  
	  //1~Bまでのry
	  c = B/C;
	  d = B/D;
	  cANDd = B / lcm(C,D);
	  long b = B - (c + d - cANDd);
	  
	  out.println(b - a); 
	  
	}
  //最小公倍数を求めるメソッド
  private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
  //最大公約数を求めるメソッド
  private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
  }	