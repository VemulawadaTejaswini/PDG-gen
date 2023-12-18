import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int answer = 1;

		long tmp = K;
		while (tmp < N) {
			tmp *= K;
			answer++;
		}

			System.out.println(answer);
	}
}