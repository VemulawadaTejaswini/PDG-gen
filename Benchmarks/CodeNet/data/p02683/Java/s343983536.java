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
	
	static void calc(long sum, boolean[] used) {
		if (min <= sum) {
			return;
		}
		
		boolean flag = true;
		boolean flag2 = true;
		
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
				flag2 = false;
				break;
			}
		}
		
		if (flag2) {
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!used[i] && sum + c[i] < min) {
				for (int j = 0; j < m; j++) {
					array[j] += a[i][j];
				}
				used[i] = true;
				calc(sum + c[i], used);
				for (int j = 0; j < m; j++) {
					array[j] -= a[i][j];
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
		/*
		array = new int[m];
		calc(0l, new boolean[n]);
		if (min >= Long.MAX_VALUE) {
			min = -1;
		}
		System.out.println(min);
		 */
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
		long[] sumArray = new long[m];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sumArray[j] += a[i][j];
			}
			sum += c[i];
		}
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
		
		long res1 = sum;
		long res2 = 0l;
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (c[i] < c[j]) {
					int tmp = c[j];
					c[j] = c[i];
					c[i] = tmp;
					int[] tmp2 = a[j];
					a[j] = a[i];
					a[i] = tmp2;
				}
			}
		}
		
		sumArray = new long[m];
		sum = 0;
		
		for (int i = 0; i < n; i++) {
			boolean flag2 = false;
			for (int j = 0; j < m; j++) {
				if (sumArray[j] < x) {
					flag2 = true;
					break;
				}
			}
			if (flag2) {
				sum += c[i];
				for (int j = 0; j < m; j++) {
					sumArray[j] += a[i][j];
				}
			} else {
				break;
			}
		}
		
		res2 = sum;
		
		if (!flag) {
			flag = true;
			for (int j = 0; j < m; j++) {
				if (sumArray[j] < x) {
					flag = false;
					break;
				}
			}
			if (!flag) {
				System.out.println(-1);
			} else {
				System.out.println(Math.min(res1, res2));
			}
		} else {
			System.out.println(Math.min(res1, res2));
		}
	}
}