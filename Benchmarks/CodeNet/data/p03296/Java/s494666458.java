public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int before = 0;
		int result = 0;
		boolean isSame = false;
		for (int i = 0; i < N; i++) {
			int cu = sc.nextInt();
			if (0 == i) {
				before = cu;
				continue;
			}

			if (isSame) {
				isSame = false;
				before = cu;
				continue;
			}

			if (before == cu) {
				isSame = true;
				result++;
			}
			before = cu;
		}
		System.out.println(result);
	}
}