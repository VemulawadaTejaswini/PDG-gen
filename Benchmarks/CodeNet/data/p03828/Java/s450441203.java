import java.util.Scanner;

public class Main {

	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[10001];
		for(int i = 2 ; i <= n ; i++) {
			for(int j = 2 ; j <= i ; j++) {
				boolean isPrime = true;
				for(int k = 2 ; k * k <= j ; k++) {
					if(j % k == 0) isPrime = false;
				}
				// jが素数なら割り切れるまで割る
				if(isPrime) {
					int temp = i;
					int ret = 0;
					while(temp % j == 0) {
						temp /= j;
						ret++;
					}
					a[j] += ret;
				}
			}
		}
//		System.out.println(Arrays.toString(a));
		long ans = 1;
		for(int i = 0 ; i <= n ; i++) {
			ans = (ans * (a[i] + 1)) % 1000000007;
		}
		System.out.println(ans);
	}
}
