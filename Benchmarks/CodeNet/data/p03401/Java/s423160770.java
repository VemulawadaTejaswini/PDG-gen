import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] diff = new int[n + 1];
		int sum = 0, pre = 0;

		for (int i = 0; i < n; i++) {
			// 観光地の座標を格納
			a[i] = sc.nextInt();
			// 前の観光地からの費用を計算
			int d = pre - a[i];
			// 前の観光地からの費用を合計に加算
			sum += Math.abs(d);
			diff[i] = d;
			pre = a[i];
		}
		sum += Math.abs(a[n - 1]);
		diff[n] = a[n - 1];
		
		for (int i = 0; i < n; i++) {
			if ((diff[i] < 0 && diff[i + 1] < 0) || (diff[i] > 0 && diff[i + 1] > 0)) {
				System.out.println(sum);
			} else {
				if (Math.abs(diff[i]) <= Math.abs(diff[i + 1])) {
					System.out.println((sum - Math.abs(diff[i] * 2)));
				} else {
					System.out.println((sum - Math.abs(diff[i + 1] * 2)));
				}
			}
		}
		
		sc.close();
	}
}
