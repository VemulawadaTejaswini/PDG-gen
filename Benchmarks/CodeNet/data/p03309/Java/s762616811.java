import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        final int SUNUKE_LENGTH = 20000;
        final int[] SUNUKE = new int[SUNUKE_LENGTH];

		try (Scanner sc = new Scanner(System.in)){

            int n = sc.nextInt();
			int[] A = new int[n];

			for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            // 悲しみの最小値
            int minSadness = getSadness(A, 0);

            for (int i = 1; i < SUNUKE_LENGTH; i++) {

            	int ri = i * -1;
                int sadness = getSadness(A, i);

                if (sadness < minSadness){
                    minSadness = sadness;
                }
            }
            System.out.println(minSadness);
		}
    }

    /**
     * すぬけ君の悲しみ.
     *
     * @param R 長さNの整数列A
     * @param b すぬけ君が選ぶ数値
     */
    public static int getSadness(int[] A, int b) {
        int resultPls = 0;
        int resultMns = 0;
        for (int i = 0; i < A.length; i++) {
            resultPls += abs(A[i] - (b + i+1));
            resultMns += abs(A[i] - (-b + i+1));
        }
        return Math.min(resultPls , resultMns);
    }

    // 絶対値を返す
    public static int abs(int num) {
        if (num < 0) {
            num *= -1;
        }
        return num;
    }
}