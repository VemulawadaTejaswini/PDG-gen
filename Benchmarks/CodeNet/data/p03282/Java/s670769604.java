
import java.util.*;
import java.util.Map.Entry;
 
 
 
public class Main{
	
	public int num;
	public int vol;
 
	
	//最大公約数・最小公倍数（セットで使う）
	public static long gcm(long a, long b) {
		long result = a;
		long k = 0;
		long n = b;
		do {
			k = result % n;
			result = n;
			n = k;
		} while(k != 0);
		return result;
	}
	
	public static long lcm(long a, long b) {
		long g;
		g = gcm(a, b);
		return a/g*b;
	}
	
	static long gcd(long a, long b) {
		if (b == 0) {
			return a;			
		}
		return gcd(b, a % b);
	}
	
	//等差数列
	static long tousasum(int n) {
		return (long)n*((long)n+1)/2;
	}
 
 
 
	//素数判定
	static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
		return true;
	}
 
 
	//倍数判定（10進数以外のときに有用）
	static boolean isMultiple (String s, int base, int m) {
		int temp = 0;
		for (int i=0; i<s.length(); i++) {
			temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
		}
		if (temp==0) {return true;}
		return false;
	}
 
 
	//階乗
	static long factorial (int i) {
		if (i==1) {return 1;}
		else {return i*factorial(i-1);}
	}
 
 
	//進数変換
	static String toNbase (String sm, int m, int n) {
		return Long.toString(Long.parseLong(sm,m),n);
	}
	
	public static final long gcd_n(long[] param) {
	    final int len = param.length;
	    long g = gcd(param[0], param[1]);    //gcd(a, b) は以前作ったもの
	    for (int i = 1; i < len - 1; i++) {
	        g = gcd(g, param[i + 1]);       //gcd(a, b) は以前作ったもの
	    }
	    return g;
	}
	
	public static long lcm_n(long[] numbers) {
		long l;
		l = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			l = lcm(l, numbers[i]);
		}
		return l;
	}
	
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String S=sc.next();
	 char[] c=S.toCharArray();
	 double K=sc.nextDouble();
	 double result = 0;
	 for(int i=0;i<c.length;i++) {
		
		result+=Math.pow(Character.getNumericValue(c[i]), 5000.0*1000000000000.0);
	    //System.out.println(result);
		if(result>=K) {
			System.out.println(Character.getNumericValue(c[i]));
			break;
		}
		 
	 }
	 
    
}
}