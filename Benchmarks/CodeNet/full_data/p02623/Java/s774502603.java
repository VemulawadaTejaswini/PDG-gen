import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long aSum[] = new long[n + 1];
		long bSum[] = new long[m + 1];
		int ans = 0;
		int max = n;
		for(int i = 1 ; i <= n ; i++) {
			aSum[i] = aSum[i - 1] + sc.nextLong();
		}

		for(int i = 0 ; i <= m ; i++) {
          if(i != m)
			bSum[i + 1] = bSum[i] + sc.nextLong();

			long best = k - bSum[i];
			if(best < 0)
				break;
			while(max > 0 && aSum[max] > best) max--;

			ans = Math.max(ans , i + max);
		}

		System.out.println(ans);

	}
}

