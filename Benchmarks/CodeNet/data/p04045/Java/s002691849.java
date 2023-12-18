import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int[] D = new int[K];
		for (int i = 0; i < K; i++) {
			D[i] = scanner.nextInt();
		}
		scanner.close();
		ArrayList<Integer> likeNums = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			if (!isLike(D, i)) {
				likeNums.add(i);
			}
		}
		// System.out.println(likeNums);
		String[] price = String.valueOf(N).split("");
		// System.out.println(Arrays.toString(price));

		for (int i = 0; i < price.length; i++) {
			for (int likeNum: likeNums) {
				if(Integer.valueOf(price[i]) <= likeNum) {
					System.out.print(likeNum);
					break;
				}
			}
		}

		System.out.println();

	}

	private static boolean isLike(int[] D, int num) {

		for (int i = 0; i < D.length; i++) {
			if(D[i] == num) {
				return true;
			}
		}

		return false;
	}

}
