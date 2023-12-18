import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String str = scanner.next();
		String[] S = new String[str.length()];
		int count = 0;

		for (int i = 0; i < N; i++) {
			String str2 = String.valueOf(str.charAt(i));
			S[i] = str2;
		}

		for (int i = 0; i < N; i++) {
			if (S[i].equals(".")) {
				count += 1;
			} 
		}

		if (count == N) {
			System.out.println(0);
		} else if (count == 1 && S[0].equals(".")) {
			System.out.println(0);
		} else
			System.out.println(count);
	}
}