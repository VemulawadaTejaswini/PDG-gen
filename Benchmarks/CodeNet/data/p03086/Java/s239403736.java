import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		String[] S = sc.nextLine().split("");

		// ACGTのいずれかがでてきたら、ACGT以外がでてくるまでカウント
		// カウントマックスに代入して、それ以降同じように繰り返す。
		int i = 0;
		int max = Integer.MIN_VALUE;
		for (String str : S) {
			if (str.equals("A") || str.equals("G") || str.equals("C") || str.equals("T")) {
				i++;
			} else {
				max = Math.max(i, max);
				i = 0;
			}
		}

		System.out.println(max);

	}
}
