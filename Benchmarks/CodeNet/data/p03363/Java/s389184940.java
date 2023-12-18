import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int[] a = new int[n];

		for (int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
		}

		int num = 0;
		int ans = 0;
		for (int num2 =0 ; num2 < n ; num2++ ) {
			for (int i = num2 ; i < n ; i++ ) {
				num += a[i];
				if (num == 0) {
					ans++;
				}
			}
			num=0;
		}

		System.out.println(ans);

		sc1.close();

	}

}