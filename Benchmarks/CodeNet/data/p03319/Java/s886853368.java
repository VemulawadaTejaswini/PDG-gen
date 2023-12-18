import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		int res = N - 1;
		int ans = 0;
		while (res > 0) {
			res -= K - 1;
			++ans;
		}
		System.out.println(ans);
		
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
