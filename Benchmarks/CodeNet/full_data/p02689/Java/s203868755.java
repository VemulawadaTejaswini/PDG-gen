import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//		String W	 = in.readLine();
		//		int num = Integer.parseInt(W.split(" ")[0]);

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();

		long[] H = new long[(int) N+1];

		for (long i = 1; i <= N; i++) {
			H[(int) i] = sc.nextLong();
		}

		long[] A = new long[(int) M+1];
		long[] B = new long[(int) M+1];
		boolean[] good = new boolean[(int) N+1];
		Arrays.fill(good, true);
		good[0]=false;

		for (long i = 1; i <= M; i++) {
			A[(int) i] = sc.nextLong();
			B[(int) i] = sc.nextLong();

			if (H[(int)A[(int) i]] <= H[(int)B[(int)i]]) {
				good[(int) A[(int) i]] = false;
			}
			if (H[(int)A[(int) i]] >= H[(int)B[(int) i]]) {
				good[(int) B[(int) i]] = false;
			}
		}
		int ans = 0;

		for (boolean goodP : good) {
			if (goodP) {
				ans++;
			}
		}
		System.out.println(ans);

	}

	//	//二分探索
	//k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray) {
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedArray[mid] <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//二分探索
	//k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList) {
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedList.get(mid) <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}
