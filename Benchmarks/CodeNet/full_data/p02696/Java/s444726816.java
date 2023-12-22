import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int max = 0;

		for (int i = 1; i <= N; i++) {
			int x = (int) (A * i / B);
			int y = A * (int) (i / B);
			if (max < x - y) {
				max = x - y;
			}
		}

		System.out.println(max);

	}

}