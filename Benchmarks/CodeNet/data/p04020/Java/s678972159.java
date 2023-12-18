public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i] / 2;
			a[i] %= 2;
			if (0 < a[i] && 0 < a[i + 1]) {
				sum++;
				a[i]--;
				a[i + 1]--;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
