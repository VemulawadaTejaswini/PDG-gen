import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int N;
	static int[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		int[] cnt = new int[2];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
			++cnt[A[i] % 2];
		}
		cnt[0] += cnt[1] / 2;
		cnt[1] %= 2;
		cnt[0] %= 2;
		if (cnt[1] * cnt[0] == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
