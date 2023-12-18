import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
			b[i] = a[i];
		}

		Arrays.sort(b);

		int min = b[n/2 - 1];
		int max = b[n/2];

		for (int i = 0 ; i < n ; i++) {
			if(a[i] <= min) {
				System.out.println(max);
			}
			else {
				System.out.println(min);
			}
		}

		sc1.close();
	}

	static int[] sort(int[] num) {

		while (true) {
			boolean test = true;
			for (int index = 0; index < num.length - 1 ; index ++) {
				if (num[index] > num[index + 1]) {
					int a = num[index];
					int b = num[index+1];
					num[index] = b;
					num[index+1] = a;
					test = false;
				}
			}
			if ( test ) {
				return num;
			}
		}
	}

}