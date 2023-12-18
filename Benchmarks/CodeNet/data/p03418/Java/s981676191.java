import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long cnt = 0;
		for(int i = k+1; i <= n; i++) {
			if(n % i != 0) {
				cnt += (n /i) * (i - k) + Math.max(0, (n % i) - k + 1);
			} else {
				cnt += (n /i) * (i - k);
			}
		}
		if(k == 0) {
			cnt = n * n;
		}
		System.out.println(cnt);
	}
}
