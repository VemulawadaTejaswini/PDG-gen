import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)){

            int n = sc.nextInt();

			long[] A = new long[n];
			long[] B = new long[n];

			for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
			// 中央値用取得の値コレクション
			for (int i = 0; i < n; i++) {
				B[i] = A[i] - (i+1);
			}
			// 中央値の取得
			long median = getMedian(B);

			// 悲しみを取得
			long sadness = getSadness(A, median);

            System.out.println(sadness);
		}
    }

    /**
     * すぬけ君の悲しみ.
     *
     * @param R 長さNの整数列A
     * @param b すぬけ君が選ぶ数値
     */
    public static long getSadness(long[] A, long b) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += abs(A[i] - (b + i+1));
        }
        //return Math.min(resultPls , resultMns);
        return result;
    }

    // 絶対値を返す
    public static long abs(long num) {
        if (num < 0) {
            num *= -1;
        }
        return num;
    }

    // additional : 中央値を返す
    public static long getMedian(long[] B){
    	// データ数
    	int n = B.length;
    	Arrays.sort(B);

    	// 中央値を求める
    	long result = 0;
    	if (n % 2 == 1) {
    		// データ数が奇数
    		result = B[n/2];
    	} else {
    		// データ数が偶数
    		result = (B[n/2-1] + B[n/2])/2;
    	}
    	return result;
    }
}