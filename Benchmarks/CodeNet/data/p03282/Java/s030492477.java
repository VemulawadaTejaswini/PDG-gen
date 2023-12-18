import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		long K = scanner.nextLong();

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < K; i++) {
			if (S.charAt(i) == '1') {
				continue;
			}
			System.out.println(S.charAt(i));
			return;
		}
		System.out.println(1);
		scanner.close();
	}
}