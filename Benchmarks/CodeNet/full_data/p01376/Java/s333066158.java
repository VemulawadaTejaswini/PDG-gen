import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int M = sc.nextInt();
		int N = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < M; ++i) {
			int count = 0;
			for (int j = 0; j < N; ++j) {
				if (sc.nextInt() != 0) {
					++count;
				}
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}

}