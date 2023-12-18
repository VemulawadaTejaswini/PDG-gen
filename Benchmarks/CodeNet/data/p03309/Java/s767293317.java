import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int sum1 = 0;
		long[] a = new long[n];
		long[] b = new long[n];

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextLong();
			b[i] = a[i] - ( i + 1 );
		}

		Arrays.sort(b);

		Long b1 = 0L;

		if (n != 1 && n % 2 != 0) {
			b1 = (long) Math.round((b[n/2] + b[n/2 - 1])/2);
		}
		else {
			b1 = b[n/2];
		}

		for ( int i = 0 ; i < n ; i++ ) {
			sum1 += Math.abs(a[i] - (b1 + i + 1));
		}

		System.out.println(sum1);

		sc1.close();

	}

}