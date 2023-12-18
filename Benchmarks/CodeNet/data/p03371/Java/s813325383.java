






import java.util.*;
import java.util.Map.Entry;



public class Main{

	
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
	
	static long gcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
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
	 int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),X=sc.nextInt(),Y=sc.nextInt();
	 long cost1=0;
	 int tmpX=X;
	 int tmpY=Y;
	
	 cost1+=Math.min(X, Y)*2*C;
	 tmpX-=Math.min(X, Y);
	 tmpY-=Math.min(X, Y);
	 if(tmpX==0) {
		cost1+=tmpY*B;
	 }else if(tmpY==0) {
		 cost1+=tmpX*A;
	 }
	 
	 tmpX=X;
	 tmpY=Y;
	 long cost2=(Math.max(X, Y)*2*C);
	 
	 
	 long cost3=A*X+B*Y;
	 
	 long cost = Math.min(Math.min(cost1, cost2), cost3);
	 
	 System.out.println(cost);
	 
 }
	


}

