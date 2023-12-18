import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		int d = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			d += Math.abs(temp - a[i]);
			temp = a[i];
		}
		d += Math.abs(temp);

		int ans = d;
		ans -= Math.abs(0 - a[0]);
		ans -= Math.abs(a[0] - a[1]);
		ans += Math.abs(a[1] - 0);
		System.out.println(ans);

		for (int i = 1; i < n - 1; i++) {
			ans = d;
			ans -= Math.abs(a[i - 1] - a[i]);
			ans -= Math.abs(a[i] - a[i + 1]);
			ans += Math.abs(a[i - 1] - a[i + 1]);
			System.out.println(ans);
		}

		ans = d;
		ans -= Math.abs(0 - a[n - 1]);
		ans -= Math.abs(a[n - 1] - a[n - 2]);
		ans += Math.abs(a[n - 2] - 0);
		System.out.println(ans);

	}

}
