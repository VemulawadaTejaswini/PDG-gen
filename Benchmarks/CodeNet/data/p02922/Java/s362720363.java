import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		int answer = 0;

		while (sum < B) {
			if (answer ==0) {
				sum += A;
			} else {
				sum += A - 1;
			}
			answer++;
		}

		System.out.println(answer);
	}
}
