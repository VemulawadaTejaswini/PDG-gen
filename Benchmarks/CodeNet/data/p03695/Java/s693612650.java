import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		boolean[] b = new boolean[10];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] < 3200) {
				b[a[i] / 400] = true;
			} else {
				cnt++;
			}
		}

		int min = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i]) {
				min++;
			}
		}
		if (min == 0) {
			min++;
			cnt--;
		}
		System.out.println(min + " " + (min + cnt));
	}
}
