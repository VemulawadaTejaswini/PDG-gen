import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];
		int s;
		int count;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			a = new int[n];
			count = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			s = sc.nextInt();

			int low = 0;
			int high = n - 1;
			int mid;
			while (low <= high) {
				mid = (low + high) / 2;
				count++;
				if (a[mid] == s) {
					break;
				} else if (a[mid] < s) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
				mid = (low + high) / 2;
			}
			System.out.println(count);
		}
	}
}