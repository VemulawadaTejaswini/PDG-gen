import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Arrays.setAll(a, i -> sc.nextInt());
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			int g = i == 0 ? a[1] : a[0];
			for (int j = 0; j < n; j++) {
				if (j == i)
					continue;
				g = gcd(g, a[j]);
			}
			max = Math.max(max, g);
		}
		
		System.out.println(max);

	}
	
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
