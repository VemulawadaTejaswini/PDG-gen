import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Christmas");

		int d = sc.nextInt();

		for (int i = 0; i < 25 - d; i++) {
			sb.append(" Eve");
		}

		System.out.println(sb);

		sc.close();
	}
}

