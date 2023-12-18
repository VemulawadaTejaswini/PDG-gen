import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int N = s.nextInt();
		int K = s.nextInt();
		int num = 1;

		for (int i = 0; i < N; i++) {
			if (num * 2 < num + K) {
				num = num * 2;
			} else {
				num = num + K;
			}
		}

		System.out.println(num);
	}
}