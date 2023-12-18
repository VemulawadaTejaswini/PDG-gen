import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for (int targetNum = 1; targetNum <= n; targetNum++) {
			int divisorCount = 0;
			for (int i = 1; i <= targetNum; i++) {
				if (n % i == 0) {
					divisorCount++;
				}
			}
			if (divisorCount == 8) {
				answer++;
			}
		}

		System.out.println(answer);

		sc.close();
	}
}