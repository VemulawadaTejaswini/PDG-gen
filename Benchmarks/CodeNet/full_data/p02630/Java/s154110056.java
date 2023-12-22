import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		int[] a = new int[1000000];
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			a[num] += 1;
			sum += (long) num;
		}
		int q = sc.nextInt();
		int[] b = new int[q];
		int[] c = new int[q];
		for (int i = 0; i < q; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			if (a[b[i]] != 0) {
				int value = a[b[i]];
				a[b[i]] = 0;
				a[c[i]] += value;
				sum -= (b[i] * value);
				sum += (c[i] * value);
			}
			sb.append(sum);
			sb.append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}