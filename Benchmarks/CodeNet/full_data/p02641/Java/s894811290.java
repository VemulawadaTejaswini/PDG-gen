import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int N = scan.nextInt();
		Integer p[] = new Integer[N];
		//int min = Math.abs(100 - X);
		int min = 100;
        int result = X;

		for (int i = 0; i < N; i++) {
			p[i] = scan.nextInt();
		}

		for (int i = 0; i <= 200; i++) {
			if (Math.abs(X - i) < min && !Arrays.asList(p).contains(i)) {
				min = Math.abs(X - i);
				result = i;
			}
		}

		System.out.println(result);

	}

}