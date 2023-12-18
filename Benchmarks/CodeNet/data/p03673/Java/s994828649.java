import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
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
		}
	}
}
