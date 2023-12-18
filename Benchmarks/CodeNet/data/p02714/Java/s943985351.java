

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
		
		int n = sc.nextInt();
		String s = sc.next();
		
		char[] s_char = s.toCharArray();
		long sum = 0;
		
		for(int i=0;i<n-2;i++) {
			//System.out.println(i+":"+s_char[i]);
			for(int j=i+1;j<n-1;j++) {
				//System.out.println(" "+j+":"+s_char[j]);
				if(s_char[i] == s_char[j])
					continue;
				for(int k=j+1;k<n;k++) {
					//System.out.println("  "+k+":"+s_char[k]);
					if(s_char[i] == s_char[k] || s_char[j] == s_char[k])
						continue;
					if((j-i) == (k-j))
						continue;
					sum++;
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
	
	// ユークリッドの互除法(最大公約数を求める)
	static long gcd(long x, long y) {
        return x%y==0? y : gcd(y,x%y);
    }
		
}
