public class Main {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		final int n = in.nextInt(), m = in.nextInt();

		if (n == 1) {
			System.out.println(in.nextInt());
			return;
		} else {
			// boolean result = true;

			List<Integer> array = new ArrayList<>();

			int k = in.nextInt();
			for (int j = 0; j < k; j++) {
				array.add(in.nextInt());
			}

			// array.forEach(System.out::println);

			boolean smallResult = false;
			List<Integer> smallResultList = new ArrayList<>();

			for (int i = 0; i < n - 1; i++) {
				smallResultList.clear();

				k = in.nextInt();
				for (int j = 0; j < k; j++) {
					int a = in.nextInt();

					if (array.contains(a)) {
						smallResult = true;
						smallResultList.add(a);
					} else {
						smallResult = false;
					}
				}

				// System.out.println("");
				// smallResultList.forEach(System.out::print);

				if (!smallResult) {
					System.out.println(0);
					return;
				}
				array.removeIf(number -> !smallResultList.contains(number));
			}

			if (smallResult) System.out.println("SIZE: " + array.size());
		}
	}

}