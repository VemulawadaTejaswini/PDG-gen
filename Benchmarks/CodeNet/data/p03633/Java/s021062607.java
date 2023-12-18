

public class Main {
	//static boolean f;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 入力の受け取り
		 * String s = sc.next();
		 * int a = sc.nextInt();
		 * long a = sc.nextLong();
		 */
		
		// 文字列(String)を文字(char)に分解
		// char[] s_char = s.toCharArray();
		
		int n = sc.nextInt();
		long t[] = new long[n];
		for(int i=0;i<n;i++)
			t[i] = sc.nextLong();
		
		long time = t[0];
		
		if(n != 1) {
			for(int i=1;i<n;i++)
				time = lcm(time,t[i]);
		}
		
		System.out.println(time);
		
		/*
		 * if(f)
		 *	System.out.println("Yes");
		 * else
		 * 	System.out.println("No");
		 */
	}
	
	// ユークリッドの互除法(最大公約数を求める)
	static long gcd(long x, long y) {
		return x%y==0? y : gcd(y,x%y);
	}
		
	// 最小公倍数を求める
	static long lcm(long x, long y) {
		return x / gcd(x, y) * y;
	}
		
}
