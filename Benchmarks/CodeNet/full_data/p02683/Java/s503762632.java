import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int x;
	static int[] c;
	static int[][] a;
	static long min = Long.MAX_VALUE;
	static int[] array;
	static long[] sumArray;
	
	static void calc(long sum, boolean[] used) {
		for (int i = 0; i < m; i++) {
			if (sumArray[i] < x) {
				return;
			}
		}
		
		if (min > sum) {
			min = sum;
		}
		
		
		for (int i = 0; i < n; i++) {
			if (!used[i]) {
				for (int j = 0; j < m; j++) {
					sumArray[j] -= a[i][j];
				}
				used[i] = true;
				calc(sum - c[i], used);
				for (int j = 0; j < m; j++) {
					sumArray[j] += a[i][j];
				}
				used[i] = false;
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
		array = new int[m];
		/*
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (c[i] > c[j]) {
					int tmp = c[j];
					c[j] = c[i];
					c[i] = tmp;
					int[] tmp2 = a[j];
					a[j] = a[i];
					a[i] = tmp2;
				}
			}
		}
		*/
		sumArray = new long[m];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sumArray[j] += a[i][j];
			}
			sum += c[i];
		}
		calc(sum, new boolean[n]);
		if (min >= Long.MAX_VALUE) {
			min = -1;
		}
		System.out.println(min);
		/*
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < m; j++) {
				if (sumArray[j] - a[i][j] < x) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sum -= c[i];
				for (int j = 0; j < m; j++) {
					sumArray[j] -= a[i][j];
				}
			}
		}
		
		boolean flag = true;
		for (int j = 0; j < m; j++) {
			if (sumArray[j] < x) {
				flag = false;
				break;
			}
		}
		if (!flag) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
		}
		
		 */
	}
}
