import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)){

            int n = sc.nextInt();
			int[] A = new int[n];
			int[] B = new int[n];

			for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
			// 中央値用取得の値コレクション
			for (int i = 0; i < n; i++) {
				B[i] = A[i] - (i+1);
			}
			// 中央値の取得
			int median = getMedian(B);

			// 悲しみを取得
			int sadness = getSadness(A, median);

            System.out.println(sadness);
		}
    }

    /**
     * すぬけ君の悲しみ.
     *
     * @param R 長さNの整数列A
     * @param b すぬけ君が選ぶ数値
     */
    public static int getSadness(int[] A, int b) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += abs(A[i] - (b + i+1));
        }
        //return Math.min(resultPls , resultMns);
        return result;
    }

    // 絶対値を返す
    public static int abs(int num) {
        if (num < 0) {
            num *= -1;
        }
        return num;
    }

    // additional : 中央値を返す
    public static int getMedian(int[] A){
    	// データ数
    	int n = A.length;
    	Arrays.sort(A);

    	// 中央値を求める
    	/*int result = 0;
    	if (n % 2 == 1) {
    		// データ数が奇数
    		result = A[n/2];
    	} else {
    		// データ数が偶数
    		result = (A[n/2-1] + A[n/2])/2;
    	}*/
    	int result = A[n/2];
    	return result;
    }
}