import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] buget = new int[100100];
		long ans = 1;
		final long mod = 1000000009;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			buget[a[i]]++;
		}
		Arrays.sort(a);
		
		boolean f = true;
		if (n % 2 == 0) {
			if(a[0] != 1) {
				System.out.println(0);
				return;
			}
			for (int i = 0; i < n; i++) {
				if (i %2 == 0) {
					if (buget[i] != 0) {
						f = false;
						break;						
					} else {
						continue;
					}
				}
				if (i %2 == 1  && buget[i] == 2) {
					ans *= 2;
					ans %= mod;
				} else {
					f = false;
					break;
				}
			}
		}

		if (n % 2 == 1) {
			if (a[0] != 0 || buget[0] != 1) {
				System.out.println(0);
				return;
			}
			for (int i = 1; i < n; i++) {
				if (i %2 == 1) {
					if (buget[i] != 0) {
						f = false;
						break;
					} else {
						continue;
					}
				}
				if (i %2 == 0 &&buget[i] == 2) {
					ans *= 2;
					ans %= mod;
				} else {
					f = false;
					break;
				}
			}
		}

		if (f) {
			System.out.println(ans);
		} else {
			System.out.println(0);
		}
	}
}
