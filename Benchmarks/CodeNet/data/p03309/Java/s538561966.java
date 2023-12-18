import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int[] a = new int[n];

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt() - ( i + 1 );
		}

		Arrays.sort(a);

		int b1 = a[n/2];
		int b2 = a[n/2] + 1;

		for ( int i = 0 ; i < n ; i++ ) {
			sum1 += Math.abs(a[i] - b1);
			sum2 += Math.abs(a[i] - b2);
		}

		if ( sum1 < sum2 ) {
			System.out.println(sum1);
		}
		else {
			System.out.println(sum2);
		}

		sc1.close();

	}

}