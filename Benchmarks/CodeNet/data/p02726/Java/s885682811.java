import java.util.*;
import java.math.*;
public class Main {
	static int r; 
	static int c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int[] ans = new int[n];
		for(int i = 1; i < n; i++) {
			for(int j = i + 1; j <= n; j++) {
				int dist = j - i;
				dist = Math.min(dist, Math.abs(i - x) + Math.abs(j - y) + 1);
				dist = Math.min(dist, Math.abs(i - y) + Math.abs(j - x) + 1);
				ans[dist] += 1;
			}
		}
		for(int i = 1; i < n; i++) {
			System.out.println(ans[i]);
		}
	}
} 
