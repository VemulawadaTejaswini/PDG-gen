import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int sum = 0;
		int[] a = new int[n];

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
			sum += a[i] - ( i + 1 );
		}

		int ans1 = sum/n;
		int ans2 = sum/n + 1;
		int ans3 = sum/n - 1;
		int ans4 = sum/n;
		int ans5 = sum/n + 2;
		int ans6 = sum/n - 2;
		int ans7 = sum/n + 3;
		int ans8 = sum/n - 3;
		int ans9 = sum/n + 4;
		int ans10 = sum/n - 4;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		int sum7 = 0;
		int sum8 = 0;
		int sum9 = 0;
		int sum10 = 0;

		for ( int i = 0 ; i < n ; i++ ) {;
			sum1 += Math.abs(a[i] - (ans1 + i + 1 ));
			sum2 += Math.abs(a[i] - (ans2 + i + 1 ));
			sum3 += Math.abs(a[i] - (ans3 + i + 1 ));
			sum4 += Math.abs(a[i] - (ans4 + i + 1 ));
			sum5 += Math.abs(a[i] - (ans5 + i + 1 ));
			sum6 += Math.abs(a[i] - (ans6 + i + 1 ));
			sum7 += Math.abs(a[i] - (ans7 + i + 1 ));
			sum8 += Math.abs(a[i] - (ans8 + i + 1 ));
			sum9 += Math.abs(a[i] - (ans9 + i + 1 ));
			sum10 += Math.abs(a[i] - (ans10 + i + 1 ));
		}


		int[] b = new int[10];
		b[0] = sum1;
		b[1] = sum2;
		b[2] = sum3;
		b[3] = sum4;
		b[4] = sum5;
		b[5] = sum6;
		b[6] = sum7;
		b[7] = sum8;
		b[8] = sum9;
		b[9] = sum10;

		Arrays.sort(b);

		System.out.println(b[0]);

		sc1.close();

	}

}