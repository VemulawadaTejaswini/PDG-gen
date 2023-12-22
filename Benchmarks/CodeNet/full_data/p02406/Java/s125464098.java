import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder answer = new StringBuilder();
		int n = sc.nextInt();
		int i = 1;

		if (n >= 3 && n <= 10000) {
			while (i <= n) {
				if (i % 3 == 0) {
					answer.append(" ").append(String.valueOf(i));
				} else {
					int x;
					x = i;
					while (x != 0) {
						if (x % 10 == 3) {
							answer.append(" ").append(String.valueOf(i));
							break;
						}
						x = x / 10;
					}
				}

				i++;
			}
		}
		System.out.println(answer.toString());

	}

}