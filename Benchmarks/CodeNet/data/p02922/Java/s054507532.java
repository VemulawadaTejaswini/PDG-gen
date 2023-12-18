import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		int answer = 0;

		for (int i = 1; i <= A; i++) {
			if (i == A) {
				sum += A;
			} else {
				sum += A - 1;
			}
			if (B <= sum) {
				answer = i;
				break;
			}
		}

		if (B == 1) {
			System.out.println(1);
		} else {
			System.out.println(answer);
		}
	}
}
