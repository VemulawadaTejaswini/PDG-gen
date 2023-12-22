public class Main {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int input = 0, total = 0;
		while (scan.hasNextInt()) {
			input = scan.nextInt();
			for (int h = 0; h < 10; ++h) {
				for (int i = 0; i < 10; ++i) {
					for (int j = 0; j < 10; ++j) {
						for (int k = 0; k < 10; ++k) {
							if (h + i + j + k == input) {
								++total;
							}
						}
					}
				}
			}
			print(total);
		}
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}