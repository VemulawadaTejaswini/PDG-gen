import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		call(new Scanner(System.in).nextInt());
	}

	static void call(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
			} else if (i % 10 == 3){
				System.out.print(" " + i);
			} else if (i / 10 != 0) {
				if (i % 10 == 3) {
					System.out.print(" " + i);
				}
			}
		}
		System.out.println();
	}
}