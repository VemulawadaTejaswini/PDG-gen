import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		long sumA = 0;
		long sumB = 0;
		long tmpSum = 0;
		int count = 0;

		for ( int i = 0 ; i < n ; i++) {
			a[i] = sc1.nextInt();
			sumA += a[i];
		}

		for ( int i = 0 ; i < n ; i++) {
			b[i] = sc1.nextInt();
			c[i] = a[i] - b[i];
			d[i] = c[i];
			sumB += b[i];
		}

		Arrays.sort(d);

		if (sumA < sumB) {
			System.out.println(-1);
		}
		else {
			if (d[0] >= 0) {
				System.out.println(0);
			}
			else {
				//不足分を求める
				for ( int j = 0 ; j < n ; j++ ) {
					if (d[j] < 0) {
						tmpSum += d[j];
						count++;
					}
					else {
						break;
					}
				}
				//超過分で埋める
				for ( int j = 0 ; j < n ; j++ ) {
					if (tmpSum < 0) {
						tmpSum += d[n-1-j];
						count++;
					}
					else {
						break;
					}
				}

				System.out.println(count);
			}
		}

		sc1.close();

	}

}
