

import java.util.*;

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
		
		int k = sc.nextInt();
		long sum = 0;
		
		for(int a=1;a<=k;a++) {
			for(int b=1;b<=k;b++) {
				for(int c=1;c<=k;c++) {
					sum += gcd(a,b,c);
				}
			}	
		}
		
		System.out.println(sum);
		
		/*
		 * if(f)
		 *	System.out.println("Yes");
		 * else
		 * 	System.out.println("No");
		 */
	}
	
	static long gcd(long a, long b, long c){
		return gcd(a,gcd(b,c));
	}
	
	// ユークリッドの互除法(最大公約数を求める)
	static long gcd(long x, long y) {
        return x%y==0? y : gcd(y,x%y);
    }
		
}
