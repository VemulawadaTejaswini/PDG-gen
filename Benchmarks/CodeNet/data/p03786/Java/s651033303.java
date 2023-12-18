
import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
		Arrays.sort(a);
		int ans = 1;
		long o = a[0];
		for (int i = 1; i < n; i++) {
			long b= a[i]%2;
				if (o>=(a[i]/2+b)){
					ans++;
					o+=a[i];
			}else{
				ans = 1;
				o+=a[i];
			}

		}
		System.out.println(ans);
	}
}