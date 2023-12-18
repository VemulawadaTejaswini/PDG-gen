import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int answer = 0;
		if (K == 0) {
			answer = N * N;
		} else {
			for (int b = K; b <= N; b++) {
				for (int a = 1; a <= N; a++) {
					if(a % b >= K) {
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}

}
