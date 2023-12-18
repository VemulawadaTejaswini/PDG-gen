import java.util.*;
import java.math.*;
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ans = new int[n + 1];
		long res = 0L;
		for(int i = 3; i <= n; i += 3) ans[i] = 1;
		for(int i = 5; i <= n; i += 5) ans[i] = 1;
		for(int i = 1; i <= n; i++) {
			if(ans[i] == 0) res += ans[i];
		}
		System.out.println(res);
	}
} 
