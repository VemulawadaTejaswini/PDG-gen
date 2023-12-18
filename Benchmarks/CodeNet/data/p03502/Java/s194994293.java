import java.util.*;

// ABC 79-D
// https://beta.atcoder.jp/contests/abc079/tasks/abc079_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int n = N;
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println(N % sum == 0 ? "Yes" : "No");
	}
}
