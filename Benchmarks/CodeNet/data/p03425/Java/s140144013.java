import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[5];//m a r c h
		String str;
		for (int i = 0; i < n; i++) {
			str = sc.next();
			if (str.startsWith("M")) {
				a[0]++;
			} else if (str.startsWith("A")) {
				a[1]++;
			} else if (str.startsWith("R")) {
				a[2]++;
			} else if (str.startsWith("C")) {
				a[3]++;
			} else if (str.startsWith("H")) {
				a[4]++;
			}
		}
		long sum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				for (int k = j + 1; k < 5; k++) {
					sum += a[i] * a[j] * a[k];
				}
			}
		}
		System.out.println(sum);
	}
}
