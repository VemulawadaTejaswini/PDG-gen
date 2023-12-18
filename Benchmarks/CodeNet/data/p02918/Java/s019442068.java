import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt(), K = sc.nextInt();
			char[] S = sc.next().toCharArray();
			int score = 0;
			for (int i = 0; i < N - 1; i++) score += S[i] == S[i + 1] ? 1 : 0;
			System.out.println(Math.min(N - 1, score + 2 * K));
		}
	}
}