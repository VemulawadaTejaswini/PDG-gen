public class Main {
	private static int n;
	private static Integer f[];

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		n = sc.nextInt();
		f = new Integer[n + 1];
		f[1] = 1;
		for (int k = 2; k <= n; k++) {
			for (int t = 1; t * k <= n; t++) {
				if (f[t * k] == null) {
					f[t * k] = 1;
				}
				f[t * k]++;
			}
		}

		long sum = 0;
		for (int k = 1; k <= n; k++) {
			sum += k * f[k];
		}
		System.out.println(sum);

	}
}
