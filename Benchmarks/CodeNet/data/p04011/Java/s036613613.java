import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int X = scanner.nextInt();
		int Y = scanner.nextInt();

		if (K >= N) {
			System.out.println(N*X);
		} else {
			System.out.println(K*X+(N-K)*Y);
		}
		scanner.close();
	}

}
