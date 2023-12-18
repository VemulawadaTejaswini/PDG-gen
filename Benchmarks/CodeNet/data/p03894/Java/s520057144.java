import java.util.*;
import java.lang.*;

public class Main{
	static boolean[] maybe;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[q];
		int[] b = new int[q];
		for (int i = 0; i < q; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		maybe = new boolean[n + 2];
		maybe[1] = true;
		maybe[2] = true;
		int now = 1;
		for (int i = 0; i < q; i++) {
			if (a[i] == now) {
				now = b[i];
			} else if (b[i] == now) {
				now = a[i];
			}
			swap(a[i], b[i]);
			maybe[now + 1] = true;
			maybe[now - 1] = true;
		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (maybe[i]) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	static void swap(int i, int j) {
		boolean tmp = maybe[i];
		maybe[i] = maybe[j];
		maybe[j] = tmp;
	}
}