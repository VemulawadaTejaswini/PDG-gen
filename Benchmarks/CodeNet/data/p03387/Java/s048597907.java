import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int[] X = nextIntArray(sc, 3);

		sc.close();

		Arrays.sort(X);
		int ans = 0;

		//最大と2番目に大きいものが一致するまで最小と2番目を2こ+1する
		while (X[1] != X[2]) {
			X[0]++;
			X[1]++;
			ans++;
		}

		//最小と最大の偶奇が違うなら、最大と2番目を2個+1する
		if (X[0] % 2 != X[2] % 2) {
			X[1]++;
			X[2]++;
			ans++;
		}

		//最小を最大と同じになるまで+2する
		while (X[0] != X[2]) {
			X[0] += 2;
			ans++;
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
