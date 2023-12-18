
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int ans = gcd(a);

		System.out.println(ans);

	}

	static int gcd(int... array) {
		int gcd = 0;
		for (int i = 0; i < array.length; i++) {
			gcd = gcd(gcd, array[i]);
		}
		return gcd;
	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}