import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		String str = scanner.next();
		int y = scanner.nextInt();
		y -= 1;
		String[] X = new String[str.length()];

		for (int i = 0; i < str.length(); i++) {
			String str2 = String.valueOf(str.charAt(i));
			X[i] = str2;
		}

		for (int j = 0;j < K; j++) {
			if (X[j].equals(X[y])) {
				System.out.print(X[j]);
			} else {
				System.out.print("*");
			}
		}
	}
}
