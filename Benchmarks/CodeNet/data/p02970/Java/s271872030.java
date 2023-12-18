import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int answer = 0;

		while (true) {
			if (N <= (2 * D + 1) * answer) break;
			answer++;
		}

		System.out.println(answer);
	}
}
