public class Q1 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input > ");
			int x = scanner.nextInt();

			int i = 25 - x;

			System.out.print("Christmas");

			for (; i > 0; i--) {
				System.out.print(" Eve");
			}

			System.out.println();
			scanner.close();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
		}
	}

}
