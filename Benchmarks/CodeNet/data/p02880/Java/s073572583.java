public class Main {

	public static void main(String[] args) {

		boolean flg = false;
		int n1 = Integer.parseInt(args[0]);
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i * j == n1) {
					System.out.print("Yes");
					flg = true;
					break;
				}
			}
		}
		if (!flg) {
			System.out.print("No");
		}
	}
}
