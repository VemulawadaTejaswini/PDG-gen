import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = -1;

		for (int i = 1; i <= 9; i++) {
			if (N <= i * 1 + i * 10 + i * 100) {
				answer = i * 1 + i * 10 + i * 100;
				break;
			}
		}

		System.out.println(answer);
	}
}
