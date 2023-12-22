import java.util.List;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int x;
	static int[] c;
	static int[][] a;
	static long min = Long.MAX_VALUE;
	
	static void calc(long sum, int[] array, boolean[] used) {
		boolean flag = true;
		for (int i = 0; i < m; i++) {
			if (array[i] < x) {
				flag = false;
				break;
			}
		}
		
		if (flag) {
			if (min > sum) {
				min = sum;
			}
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!used[i]) {
				int[] tmp = array.clone();
				for (int j = 0; j < m; j++) {
					tmp[j] += a[i][j];
				}
				boolean[] tmp2 = used.clone();
				tmp2[i] = true;
				calc(sum + c[i], tmp, tmp2);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();
		c = new int[n];
		a = new int[n][m];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		calc(0l, new int[m], new boolean[n]);
		if (min >= Long.MAX_VALUE) {
			min = -1;
		}
		System.out.println(min);
	}
}
