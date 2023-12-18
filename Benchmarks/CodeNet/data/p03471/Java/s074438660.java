	private void solveC() {
		Scanner scanner = null;
		int n = 0;
		int y = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();
			y = scanner.nextInt();

			for (int i = n; i >= 0; i--) {
				if (i * 10000 > y) {
					continue;
				}
				for (int j = 0; j <= n - i; j++) {
					for (int k = 0; k <= n - i - j; k++) {
						if (n == i + j + k && i * 10000 + j * 5000 + k * 1000 == y) {
							System.out.println(i + " " + j + " " + k);
							return;
						}
					}
				}
			}

			System.out.println(-1 + " " + -1 + " " + -1);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}