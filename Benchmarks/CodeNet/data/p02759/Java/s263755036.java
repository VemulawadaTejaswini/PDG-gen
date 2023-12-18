Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if (N == 1) {
			System.out.println(1);
		} else {
			double answer = Math.ceil(N / 2);
			System.out.println((int) answer);
		}