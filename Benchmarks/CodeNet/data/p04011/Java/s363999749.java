public class toi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n_day = Integer.parseInt(args[0]);
		int k_day = Integer.parseInt(args[1]);
		int x_yen = Integer.parseInt(args[2]);
		int y_yen = Integer.parseInt(args[3]);
		int sum = 0;

		for (int i = 1; i <= n_day; i++) {
			if (i < k_day) {
				sum = sum + y_yen;
			}
			if (i >= k_day) {
				sum = sum + x_yen;
			}
		}
		System.out.println(sum);
	}
}
