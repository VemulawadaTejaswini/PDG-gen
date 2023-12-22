import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String W	 = in.readLine();
//				int num = Integer.parseInt(W.split(" ")[0]);

//		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(W.split(" ")[0]);

		int[] A = new int[N];
		boolean[] possible = new boolean[N];
		W	 = in.readLine();
		for (int i = 0; i < N; i++) {
			int thisInt = Integer.parseInt(W.split(" ")[i]);
			if(thisInt < N) {
				possible[i] = true;
				A[i] = thisInt;
			}

		}

		int ans = 0;
		for (int i = 0; i < N && possible[i] == true; i++) {
			for (int j = i+1;j<N; j++) {
				int tall = A[i] + A[j];

				if (Math.abs(i - j) == tall) {
					ans++;
				}
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
