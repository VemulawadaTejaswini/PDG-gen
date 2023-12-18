import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] b = new int[n];
		int[] a = new int[n];

		int tmp = 0;
		int count = 0;
		int money = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length -1; i++) {
			for (int j = a.length - 1; j > i ; j--) {
				if (a[j] < a[j-1]) {
					tmp = a[j-1];
					a[j-1] = a[j];
					a[j] = tmp;

					tmp = b[j-1];
					b[j-1] = b[j];
					b[j] = tmp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
			count += b[i];
			if (count < m) {
				money += a[i] * b[i];

			} else if (count == m) {
				money += a[i] * b[i];
				break;

			} else {
				money +=  a[i] * (m - (count - b[i])) ;
				break;
			}

		}

		System.out.println(money);

	}

}


