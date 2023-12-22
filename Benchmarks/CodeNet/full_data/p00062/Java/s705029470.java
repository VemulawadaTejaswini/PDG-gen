import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()) {
			String str = sc.nextLine();
			pyramid(str);
		}

	}

	private static void pyramid(String str) {
		int[][] pyramid = new int[str.length()][str.length()];

			for (int i = 0; i < str.length(); i++) {
				pyramid[0][i] = str.charAt(i) - '0';
			}

			for (int i = 0; i < str.length() - 1; i++) {
				for (int j = 0; j < str.length() - 1; j++) {
					pyramid[i + 1][j] = ( pyramid[i][j] + pyramid[i][j + 1] ) % 10;
				}
			}
		System.out.println(pyramid[str.length() - 1][0]);
	}
}
