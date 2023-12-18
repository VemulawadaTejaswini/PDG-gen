import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		boolean[] usedred = new boolean[n];
		boolean[] usedblue = new boolean[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			int bluei = -1;
			int bluex = 2 * n + 1;
			int bluey = 0;
			for (int j = 0; j < n; j++) {
				if (c[j] < bluex && !usedblue[j]) {
					bluei = j;
					bluex = c[j];
					bluey = d[j];
				}
			}
			if (bluei == -1) {
				continue;
			}
			usedblue[bluei] = true;
			int redi = -1;
			int redx = -1;
			int redy = -1;
			for (int j = 0; j < n; j++) {
				if (a[j] < bluex && !usedred[j] && b[j] > redy && b[j] < bluey) {
					redi = j;
					redx = a[j];
					redy = b[j];
				}
			}
			if (redi == -1) {
				continue;
			}
			usedred[redi] = true;
			count++;
		}
		System.out.println(count);
	}
}