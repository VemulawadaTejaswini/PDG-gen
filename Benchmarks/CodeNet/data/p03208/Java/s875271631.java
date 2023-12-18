package newbie;

import java.util.*;

public class Hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int [] a = new int[n];
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) a[i] = scan.nextInt();
		Arrays.sort(a);
		for(int i = k - 1; i < n; i++) {
			ans = Math.min(ans, a[i] - a[i - k + 1]);
		}
		System.out.println(ans);
		scan.close();
	}
}