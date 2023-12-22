	long divisors(long n) {
		long sum = 0;
		for (long d = 2; d * d <= n; d++) {
			if (n % d == 0) {
				sum += d;
				if (d * d != n) sum += n / d;
			}
		}
		return sum + 1;
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			if (N == 0) break;
			if (N == 1) {
				System.out.println("deficient number");
				continue;
			}

			int s = (int) divisors(N);
			if (s > N) {
				System.out.println("abundant number");
			} else if (s < N) {
				System.out.println("deficient number");
			} else {
				System.out.println("perfect number");
			}
		}
	}


	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}