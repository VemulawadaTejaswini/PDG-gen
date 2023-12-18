import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		int low = 0;
		int lowCount = 0;
		int high = n;
		int highCount = 0;
		int tmp = 0;
		long sum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = lowCount; j < n; j++) {
				if (b[i] > a[j]) {
					low++;
				} else {
					break;
				}
			}
			lowCount = low;

			for (int j = highCount; j < n ; j++) {
				if (b[i] >= c[j]) {
					high--;
					tmp++;
				} else {
					break;
				}
			}
			highCount = tmp;
			sum += low * high;
		}
		System.out.println(sum);
	}
}