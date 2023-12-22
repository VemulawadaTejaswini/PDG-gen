import java.util.*;
import java.math.*;
public class Main {
	static long ans = 0L;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int q = in.nextInt();
		int[] ar = new int[n];
		int[][] qd = new int[q][4];
		for(int i = 0; i < q; i++) {
			for(int j = 0; j < 4; j++) {
				qd[i][j] = in.nextInt();
			}
		}
		generate(1, 0, n, m, qd, q, ar);
		System.out.println(ans);
	}
	public static void generate(int i, int index, int n, int m, int[][] qd, int q, int[] ar) {
		if(i > m) return;
		if(index >= n) return;
		for(int ii = i; ii <= m; ii++) {
			ar[index] = ii;
			generate(i + 1, index + 1, n, m, qd, q, ar);
			if(index == n - 1) {
				ans = Math.max(ans, solve(ar, qd, q));
			}
		}
	}
	public static long solve(int[] ar, int[][] qd, int q) {
		long temp = 0L;
		for(int i = 0; i < q; i++) {
			if(ar[qd[i][1] - 1] - ar[qd[i][0] - 1] == qd[i][2]) temp += qd[i][3];
		}
		return temp;
	}
} 
