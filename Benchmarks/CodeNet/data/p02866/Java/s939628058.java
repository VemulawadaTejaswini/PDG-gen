import java.util.*;
import java.util.Map.Entry;
 

public class Main{
	
	
	
	
	public static long answer = 0;
	public static long MOD=1000000007;
	
	
	

	

 
	
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
	static long factorial (int k) {
		long sum = 1;
		for(int i=1;i<=k;i++) {
			sum = (sum*i)%MOD;
		}
		return sum;
		
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
	public static int H,W;
	public static char[][] c;
	public static boolean[][] b;
	
	
    
	
	
 public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 Set<Integer> d =new HashSet<Integer>();
	 int middlenum = 0;
	 if(N%2==0) {
		 middlenum = N/2 - 1;
	 }else {
		 middlenum = N/2;
	 }
	 for(int i=0;i<N;i++) {
		 int temp=sc.nextInt();
		 if(i<=middlenum) {
			 d.add(temp);
		 }
	 }
	 long INF = 998244353;
	 
	 if(d.size()==1) {
		 System.out.println(0);
	 }else {
		 long result = 1;
		 for(int i=1;i<=d.size();i++) {
			 result = (result * i) % INF;
		 }
		 System.out.println(result);
	 }
	 
	 
	 

	 
	 
	
}
 
 
}