import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int answer = -1;
		int min = Integer.MAX_VALUE;
		int tmp = 0;
		int tmp2 = 0;

		for (int i = 0; i < N; i++) {
			tmp2 = sc.nextInt();
			tmp = sc.nextInt();
			if (tmp < T) {
				if (tmp < min) {
					answer = tmp2;
					min = tmp;
				}
			}
		}

		if (answer == -1) {
			System.out.println("TLE");
		} else {
			System.out.println(answer);
		}
	}
}
