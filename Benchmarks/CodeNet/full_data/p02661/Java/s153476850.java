import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] a = new long[n], b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(b);

		int mid = n / 2;
		if (n % 2 == 0) { // .5も含む
//			double min = (a[mid - 1] + a[mid]) / 2;
//			double max = (b[mid - 1] + b[mid]) / 2;
//			System.out.println((int) (max - min) * 2 + 1); // (max-min+1)*2-1
			
			// 整数で扱っても結果は変わらない．
			long min = (a[mid - 1] + a[mid]);
			long max = (b[mid - 1] + b[mid]);
			System.out.println(max - min + 1);
		} else {
			// 整数値のみ
			System.out.println(b[mid] - a[mid] + 1);
		}
	}
}
