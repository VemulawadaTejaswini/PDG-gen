
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static long[][] convMatrix;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int outsideCnt = 0;
		List<Long> nums = new ArrayList<Long>();
		for (int i = 0; i < size + 1; i++) {
			long nextNum = sc.nextLong();
			if (nums.indexOf(nextNum) >= 0) {
				outsideCnt = size - i + nums.indexOf(nextNum);
				break;
			}
			nums.add(nextNum);
		}

		calcConvMatrix(size + 1);
		for (int i = 1; i <= size + 1; i++) {
			// n+1Ci - durationCi-1
			long dup = getConv(size + 1, i);
			long extract = getConv(outsideCnt, i - 1);
			System.out.println(dup - extract);
		}
		sc.close();
	}

	private static void calcConvMatrix(int size) {
		int herf = size / 2 + 1;
		convMatrix = new long[size + 1][herf];
		for (int i = 0; i < size + 1; i++) {
			for (int j = 0; j < herf; j++) {
				if (j - 1 < 0 || i - 1 < 0) {
					convMatrix[i][j] = 1;
				} else {
					convMatrix[i][j] = (convMatrix[i][j - 1] + convMatrix[i - 1][j]) % (1000000007);
				}
			}
		}
	}
	/**
	 * return nCr
	 * @param n
	 * @param i
	 * @return
	 */
	private static long getConv(int n, int r){
		if(n - r < 0)return 0;
		if(r < n - r){
			return convMatrix[n - r][r];
		}else{
			return convMatrix[r][n - r];
		}
	}

}
