Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int t = in.nextInt();
		System.out.println((int)Math.ceil((double)n / (double)x) * t);
		in.close();