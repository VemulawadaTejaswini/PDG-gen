/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		long x = scanner.nextInt();
		long y = scanner.nextInt();
		
		/*
		long a;
		while (x % y != 0) {
			a = x;
			x = y;
			y = a % y;
			
		}
		System.out.println(y);
		*/
		
		long result = getGcd(x, y);
		
		System.out.println(result);
	}
	
	static long getGcd(long x, long y) {
		long a;
		//System.out.println(x + "," + y);
		// 終了条件
		if (x % y == 0) {
			return y;
		}
		// 引数を再設定
		a = x;
		x = y;
		y = a % y;
		
		// 再実行
		return getGcd(x, y);
	}
}
