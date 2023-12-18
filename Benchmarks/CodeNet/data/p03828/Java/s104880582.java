import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[1010];
		for(int i = 2 ; i <= 1000 ; i++) {
			boolean isPrime = true;
			for(int j = 2 ; j * j <= i ; j++) {
				if(i % j == 0) isPrime = false;
			}
			if(isPrime) {
				int v = i;
				while(v <= 1000) {
					a[i] += n / v;
					v *= i;
				}
			}
		}
		long ans = 1;
		for(int i = 0 ; i <= 1000 ; i++) {
			ans = ans * (a[i] + 1) % 1000000007;
		}
		System.out.println(ans);
	}
}
