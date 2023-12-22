import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] numbers = new int[10];
			while (sc.hasNextInt()) {
				int dataset = sc.nextInt();
				for (int i = 0; i < dataset; i++) {
					for (int j = 0; j < 10; j++) {
						numbers[i] = sc.nextInt();
					}
					boolean b = true;
					for (int k = 2; k < 8; k++) {
						if (numbers[k] < numbers[k - 1]
								&& numbers[k] < numbers[k - 2]) {
							b = false;
						}
					}
					if (b)
						System.out.println("YES");
					else
						System.out.println("NO");
				}
			}
		} finally {
			sc.close();
		}
	}
}