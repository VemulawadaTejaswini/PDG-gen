public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			calcMat(n);
		}
	}

	private static void calcMat(int n) {
		int[][] mt = new int[n + 1][n + 1];

			for (int i = 0; i < n; i++) {
				String[] dt = sc.nextLine().split(" ");
				for (int j = 0; j < n; j++) {
					mt[i][j] =  Integer.parseInt(dt[j]);
					mt[i][n] +=  mt[i][j];
					mt[n][j] += mt[i][j];
				}
			}

			for (int i = 0; i < n; i++) {
				mt[n][n] += mt[i][n];
			}

			for (int i = 0; i < n + 1; i++) {
				for (int j = 0; j < n + 1; j++) {
					String sp = (j < n)? "" : "\n";
					System.out.printf("%5d%s",mt[i][j] ,sp);
				}
			}
	}
}
