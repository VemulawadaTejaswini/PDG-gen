import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = (int)sc.nextLong();
		long a[] = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		
		if(n % 2 == 0) {
			for(int i = 0; i < n /2; i++) {
				System.out.print(a[(n - 1) - (2 * i)]);
				System.out.print(" ");
			}
			for(int i = 0; i < n / 2; i++) {
				System.out.print(a[2 * i]);
				System.out.print(" ");
			}
			System.out.println();
		} else {
			for(int i = 0; i < n / 2; i++) {
				System.out.print(a[(n - 1)] - (2 * i));
				System.out.print(" ");
			}
			System.out.print(a[0]);
			System.out.print(" ");
			for(int i = 0; i < n / 2; i++) {
				System.out.print(a[2 * i + 1]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
