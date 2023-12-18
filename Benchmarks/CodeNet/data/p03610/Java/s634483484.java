import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] N = scanner.next().toCharArray();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N.length; i += 2) {
				sb.append(N[i]);
			}

			System.out.println(sb.toString());
		}
	}
}