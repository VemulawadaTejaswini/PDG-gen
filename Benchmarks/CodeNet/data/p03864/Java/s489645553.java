import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		
		long[] a = new long[n];
		Arrays.setAll(a, i -> sc.nextLong());
		
		long sum = 0;
		for (int i = 1; i < n; i++) {
			long dif = a[i - 1] + a[i] - x;
			
			if (dif > 0) {
				if (a[i] >= dif) {
					a[i] -= dif;
				} else {
					a[i - 1] -= dif - a[i];
					a[i] = 0;
				}
				sum += dif;
			}
		}
		
		System.out.println(sum);

		
		sc.close();
	}
}


