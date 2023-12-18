import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
 
		long ans = 0;
		for(int i = 1; i <= n; ++i) {
			int s = sum(i);
			if(s >= a && s <= b)
				ans += i;
		}
 
		System.out.println(ans);
 	}
 
 	private static int sum(int n) {
 		int ret = 0;
 		while(n > 0) {
 			ret += n % 10;
 			n /= 10;
 		}
 
 		return ret;
 	}
}