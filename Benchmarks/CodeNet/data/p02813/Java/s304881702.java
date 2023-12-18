import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main{
	public static void main(String[] $){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		Integer a[] = new Integer[n];
		Integer b[] = new Integer[n];

		int p[] = new int[n];
		int q[] = new int[n];

		for (int i = 1; i <= n; i++) {
			a[i - 1] = i;
			b[i - 1] = a[i- 1];
		}

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			q[i] = sc.nextInt();
		}

		Arrays.sort(a);
		// 降順にソートした配列bを用意しておき、aとbが等しくなるまでループする
		Arrays.sort(b, Collections.reverseOrder());

		int count = 1;
		int x = 0;
		int y = 0;
		while (!(Arrays.toString(a).equals(Arrays.toString(b)))) {
			int maxIndex = 0;
			for (int i = 1; i < n; i++) {
				if (a[i - 1] < a[i]) maxIndex = i - 1;
			}

			int lastIndex = 0;
			for (int i = n - 1; 0 <= i; i--) {
				if (a[maxIndex] < a[i]) {
					lastIndex = i;
					break;
				}
			}

			int tmp = a[lastIndex];
			a[lastIndex] = a[maxIndex];
			a[maxIndex] = tmp;
			Arrays.sort(a, maxIndex + 1, a.length);
			count++;
			if (Arrays.toString(a).equals(Arrays.toString(p))) {
				x = count;
			} else if (Arrays.toString(a).equals(Arrays.toString(q))) {
				y = count;
			}
		}

		System.out.println(Math.abs(x - y));

		sc.close();
	}
}