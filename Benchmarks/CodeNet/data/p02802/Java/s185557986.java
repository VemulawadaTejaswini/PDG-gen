import java.util.*;

class ansdata{
	int AC=0;
	int WA=0;
}
 

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
	
	
	private static String convertToOiginal(String unicode)
	{
	    String[] codeStrs = unicode.split("\\\\u");
	    int[] codePoints = new int[codeStrs.length - 1]; // 最初が空文字なのでそれを抜かす
	    for (int i = 0; i < codePoints.length; i++) {
	        codePoints[i] = Integer.parseInt(codeStrs[i + 1], 16);
	    }
	    String encodedText = new String(codePoints, 0, codePoints.length);
	    return encodedText;
	}
	
	
 public static void main(String[] args) {
	 
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt(),M=sc.nextInt();
	int p[] = new int[M];
	String S[] =new String[M];
	long temp;
	long WA = 0;
	long index = 0;
	int before = 0;
	Map<Integer,ansdata> AC= new TreeMap<Integer,ansdata>();
	for(int i=0;i<M;i++) {
		p[i]=sc.nextInt();
		S[i]=sc.next();
		if(!AC.containsKey(p[i])) {
			ansdata a = new ansdata();
			if(S[i].equals("AC")) {
				a.AC++;
			}else {
				a.WA++;
			}
			AC.put(p[i],a);
			
		}else {
			ansdata a = AC.get(p[i]);
			if(a.AC==0&&S[i].equals("AC")) {
				a.AC++;
			}else if(a.AC==0&&S[i].equals("WA")) {
				a.WA++;
			}
			
		}
		
	}
	
	for (Integer treeKey : AC.keySet()) {
		ansdata a = AC.get(treeKey);
		if(a.AC==1) {
			WA+=a.WA;
		}
	}
	
	
	
	System.out.println(AC.size());
	System.out.println(WA);
	
	
	
	
	
	 

	 
	 
	
}
 
 
}
