import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 1;
		int answer = 0;

		for (int i = 1; i < A; i++) {
			sum += A - 1;
			if (B <= sum) {
				answer = i;
				break;
			}
		}

		System.out.println(answer);
	}
}
