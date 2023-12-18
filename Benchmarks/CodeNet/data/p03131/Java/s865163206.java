import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<Integer> list = new ArrayList<>();

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long k = stdIn.nextLong();
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long ans;
		long n;
		/*int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = stdIn.nextInt();*/
		if (a >= b)
			ans = k + 1;
		else {
			if (k >= a + 1) {
				n = k - (a + 1);
				ans = (n / (a + 2)) * b + b + (n % (a + 2));
				if (n % (a + 2) == a + 1)
					ans = ans + 1;
			}
			else
				ans = k + 1;
		}
		System.out.println(ans);
	}
}