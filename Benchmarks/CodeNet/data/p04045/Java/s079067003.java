import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Integer[] dislike = new Integer[K];
		int[] kingakuArray = new int[String.valueOf(N).length()];
		String answer = "";

		for (int i = 0; i < K; i++) {
			dislike[i] = sc.nextInt();
		}

		kingakuArray = parseInts(String.valueOf(N).split(""));

		for (int i = 0; i < kingakuArray.length; i++) {
			for (int j = 0; j <= 9; j++) {
				if (kingakuArray[i] <= j && !Arrays.asList(dislike).contains(j)) {
					answer = answer.concat(String.valueOf(j));
					break;
				}
			}
		}

		System.out.println(answer);
	}

	private static int[] parseInts(String[] s) {
		int[] x = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			x[i] = Integer.parseInt(s[i]);
		}
		return x;
	}
}
