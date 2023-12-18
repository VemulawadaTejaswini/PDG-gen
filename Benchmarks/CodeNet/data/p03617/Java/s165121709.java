import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int h = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();
		long n = sc.nextInt() * 4;
		sc.close();

		Tea[] arr = new Tea[4];
		arr[0] = new Tea(q, 1);
		arr[1] = new Tea(h, 2);
		arr[2] = new Tea(s, 4);
		arr[3] = new Tea(d, 8);
		Arrays.parallelSort(arr);

		long ans = 0;
		int i = 0;
		while (n > 0) {
			long a = n / arr[i].m;
			ans += arr[i].p * a;
			n %= arr[i].m;
			i++;
		}
		System.out.println(ans);
	}

	static class Tea implements Comparable<Tea> {
		int p, m;

		public Tea(int p, int m) {
			this.p = p;
			this.m = m;
		}

		public int compareTo(Tea o) {
			return p * 8 / m - o.p * 8 / o.m;
		}
	}
}
