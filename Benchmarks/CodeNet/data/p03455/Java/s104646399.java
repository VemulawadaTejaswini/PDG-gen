		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

		int seki = a * b;
		if (seki % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}