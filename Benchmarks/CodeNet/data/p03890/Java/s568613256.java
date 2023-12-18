import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[1 << n];
		for (int i = 0; i < 1 << n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i < 1 << n; i *= 2) {
			for (int j = 0; j < 1 << n; j += i * 2) {
				if (a[j] != a[j + i]) {
					a[j] = Math.abs(a[j] - a[j + i]);
				}
			}
		}
		System.out.println(a[0]);
	}
}