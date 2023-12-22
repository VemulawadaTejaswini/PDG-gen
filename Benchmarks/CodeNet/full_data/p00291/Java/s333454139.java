	public static void main(String[] args) {
		System.out.println(canChangebill());

	}

	private static int canChangebill() {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[] {1, 5, 10, 50, 100, 500};
		int sum = 0;
			for (int i = 0; i < c.length; i++) {
				sum += sc.nextInt() * c[i];
			}

		sc.close();
		if (sum >= 1000) {
			return 1;
		} else {
			return 0;
		}

	}
}
