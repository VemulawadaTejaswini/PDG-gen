import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		int d = 0;
		int min = 9;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 10 == 0) {
				b[i] = a[i];
				c[i] = 1;

			} else {
				int temp = a[i] / 10;
				b[i] = temp * 10 + 10;
				String str = String.valueOf(a[i]);
				String check = str.substring(str.length() - 1);
				if (min > Integer.parseInt(check)) {
					min = Math.min(min, Integer.parseInt(check));
					d = i;
				}
			}
		}

		b[d] = a[d];

		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		System.out.println(sum);
	}

}
