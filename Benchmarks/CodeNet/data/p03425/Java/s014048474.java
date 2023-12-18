import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[5];
		String march = "MARCH";
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int idx = march.indexOf(s.charAt(0));
			if (idx != -1)
				a[idx]++;
		}

		long ret = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				for (int k = j + 1; k < 5; k++) {
					ret += a[i] * a[j] * a[k];
				}

			}
		}

		System.out.println(ret);
	}
}
