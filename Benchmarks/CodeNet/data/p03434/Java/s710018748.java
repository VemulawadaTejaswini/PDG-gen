import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);
		long aSum = 0;
		long bSum = 0;
		boolean flg = true;
		for (int i = N - 1; i >= 0; i--) {
			if (flg) {
				aSum += input[i];
				flg = !flg;
			} else {
				bSum += input[i];
				flg = !flg;
			}
		}
		System.out.println(aSum - bSum);

	}
}
