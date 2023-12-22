import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;


class Main {
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = sc.nextInt();
			if(a + b + d == 0) break;
			int[] ans = solve(a, b, d);
			System.out.println(ans[0] + " " + ans[1]);
		}
	}
	
	static void comp(int[] ans, int acount, int bcount) {
		if(ans[0] + ans[1] > acount + bcount) {
			ans[0] = acount;
			ans[1] = bcount;
		}
	}
	
	static int[] solve(int a, int b, int d) {
		int inf = 1 << 28;
		int[] ans = {inf, inf};
		
		if((d % a) % b == 0) {
			comp(ans, d/a, (d%a)/b);
		}
		
		if((d % b) % a == 0) {
			comp(ans, (d % b) / a,  d / b);
		}
		
		int asum = a;
		int bsum = 0;
		while(asum != bsum) {
			int diff = asum - bsum;
			if(Math.abs(diff) == d) {
				comp(ans, asum / a, bsum / b);
				break;
			}
			if(diff < d) {
				asum += a;
			} else {
				bsum += b;
			}
		}
		
		asum = 0;
		bsum = b;
		while(asum != bsum) {
			int diff = bsum - asum;
			if(Math.abs(diff) == d) {
				comp(ans, asum / a, bsum / b);
				break;
			}
			if(diff < d) {
				bsum += b;
			} else {
				asum += a;
			}
		}
		
		return ans;
	}
}