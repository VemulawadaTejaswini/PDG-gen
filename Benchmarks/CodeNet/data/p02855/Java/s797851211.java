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
	
	
    
	
	
 public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	 int H=sc.nextInt(),W=sc.nextInt(),K=sc.nextInt();
	 char[][] s=new char[H][W];
	 for(int i=0;i<H;i++) {
		 s[i]=sc.next().toCharArray();
	 }
	 int currentnum = 1;
	 int[][] ans=new int[H][W];
	 for(int i = 0;i < H;i++) {
		 int strawberrynum = 0;
		 for(int j=0;j<W;j++) {
			 if(s[i][j]=='#') {
				 strawberrynum++;
			 }
		 }
		 if(strawberrynum == 1) {
			 Arrays.fill(ans[i], currentnum);
			 currentnum++;
		 }else if(strawberrynum == 0) {
			 if(i==0) {
				 continue;
			 }else {
				 for(int j=0;j<W;j++) {
					 ans[i][j] = ans[i-1][j];
				 }
				 
			 }
			 
		 }else {
			 for(int j=0;j<W;j++) {
				 ans[i][j]=currentnum;
				 if(i!=0&&ans[i-1][j]==0) {
					 ans[i-1][j]=ans[i][j];
				 }
				 if(s[i][j]=='#'&&strawberrynum > 1) {
					 currentnum++;
					 strawberrynum--;
				 }
			 }
			 currentnum++;
			 
		 }
		 
	 }
	 
	 for(int i = 0;i < H;i++) {
		 for(int j=0;j<W;j++) {
			 System.out.print(ans[i][j]+" ");
		 }
		 System.out.println();
		 
	 }
	 
	
	 
	 
	 

	 
	 
	
}
 
 
}
