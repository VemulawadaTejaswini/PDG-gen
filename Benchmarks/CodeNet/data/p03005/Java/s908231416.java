public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans;
		if (k > 1) {
			ans = n - k;
		} else {
			ans = 0;
		}
		System.out.println(ans);

	}