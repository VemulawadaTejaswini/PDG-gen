import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int answer = 0;
		for (int a = K; a < N; a++) {
			for (int b = a + 1; b < N + 1; b++) {
				if (((N - a) % b) == 0) {
					answer += (N - a) / b;
				} else {
					answer += 1 + (N - a) / b;
				}
			}
		}
		System.out.println(answer);
	}

}