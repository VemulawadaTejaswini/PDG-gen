import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	/** 計算する最大値 */
	private static final int N = 10_000;

	/** 素数を保管するリスト */
	private static final List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			calcPrimes(N);
			// 最大値まで2017に似た数を計算する
			int[] count = new int[N];
			count[0] = count[1] = count[2] = 0;
			IntStream.range(3, N).forEach(i -> count[i] = count[i - 1] + (is2017LikeNumber(i) ? 1 : 0));
			int q = scanner.nextInt();
			IntStream.range(0, q).map(i -> {
				int l = scanner.nextInt();
				int r = scanner.nextInt();
				return count[r] - count[l - 1];
			}).forEach(System.out::println);
		}
	}

	/**
	 * 素数の一覧を計算する
	 * 
	 * @param max 計算する最大値
	 */
	private static void calcPrimes(int max) {
		// UNITテスト用にいったんリストをクリア
		list.clear();
		IntStream.rangeClosed(2, max).filter(i -> isPrime(i)).forEach(list::add);
	}

	/**
	 * 入力数字が素数かどうかを判定する
	 * 
	 * @param number 入力数字
	 * @return 入力数字が素数かどうか
	 */
	private static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number);
		for (int i : list) {
			if (i > sqrt) {
				return true;
			}
			if (0 == (number % i)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 入力数字が2017に似た数であるかどうかを計算
	 * 
	 * @param number 入力数字
	 * @return 入力数字が2017に似た数であるかどうか
	 */
	private static boolean is2017LikeNumber(int number) {
		return (1 == (number & 1)) && list.contains(number) && list.contains((number + 1) / 2);
	}
}
