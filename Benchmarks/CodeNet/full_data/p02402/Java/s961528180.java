import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		int n = Integer.parseInt(line1);
		String[] x = line2.split(" ");
		int[] a = new int[x.length];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(x[i]);
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		for (int i = 0; i < n; i++) {
			int keep = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > a[j + 1]) {
				a[j] = a[j + 1];
				j--;
			}
			a[j + 1] = keep;
		}

		System.out.println(a[0] + " " + a[n - 1] + " " + sum);

	}

}