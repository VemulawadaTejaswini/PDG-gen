import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			for (int bit = 0; bit < (1<<n); bit++) {
				System.out.print(bit + ":");
				for (int j = 0; j < n; j++) {
					if (((bit>>j) & 1) == 1) {
						System.out.print(" " + j);
					}
				}
				System.out.println();
			}
		}
	}
}
