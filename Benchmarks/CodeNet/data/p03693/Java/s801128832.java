public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] a = { 0, 0, 0, 0 };
		int[] b = { 0, 0, 0, 0 };
		int n = 0;

		for (int i = 1; i < 4; i++) {
			do {
				do {
					a[i] = stdIn.nextInt();
				} while (a[i] < 0 && 10 < a[i]);

				for (int j = 1; j <= i; j++) {
					if (b[j] == a[i]) {
						n = 1;
						break;
					}
					else
						n = 0;
				}

				b[i] = a[i];
			} while (n == 1);
		}

		System.out.println();
		n = a[1]*100+a[2]*10+a[3];

		if(n % 4 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}