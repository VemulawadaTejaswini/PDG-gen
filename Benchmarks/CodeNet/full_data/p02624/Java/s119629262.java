import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int  n = Integer.parseInt(scanner.nextLine());
		int i = 1;
		long ans = 0;

		long[] list = divisor(n);
		while(i <= n) {

			ans += list[i] * i;
			i++;
		}
		System.out.println(ans);
	}

	private static long[] divisor(long num) {
		int MAX   = (int)num;
		long[] cnt = new long[(MAX + 2)];

		int i = 0;
        int j = 0;
		cnt[1] = 1;
		for(i = 2; i <= MAX; i++) cnt[i] = 2;
		for(i=2; i<=MAX/2; i++) {
			for(j = 2*i; j <= MAX; j += i) { cnt[j]++;}
		}

		return cnt;

	}
}
