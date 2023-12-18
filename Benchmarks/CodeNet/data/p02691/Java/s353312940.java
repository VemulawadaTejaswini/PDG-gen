class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		Map<Long, Integer> map = new HashMap<>();
		long count = 0;

		for (int i = 0; i < n; i++) {
			long saveme = sc.nextLong();

			long former = i - saveme;
			long latter = i + saveme;

			count += map.getOrDefault(former, 0);

			map.putIfAbsent(latter, 0);
			map.put(latter, map.get(latter) + 1);
		}

		sc.close();

		System.out.println(count);
	}
}