import java.util.Scanner;

public class Main {

	private static String regex(int a, String s) {
		char c = s.charAt(a);

		String result = "";
		for (int i = 0; i < a; i++) {
			result += ".";
		}
		result = result + c;
		for (int i = a + 1; i < s.length(); i++) {
			result += ".";
		}
		return result;

	}

	// 何文字合致するか調べる
	private static int fit (String a, String b) {

		int result = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				result++;
			}
		}
		return result;
	}

//	public static void main(String[] args) {
//		System.out.println(regex(2, "aaa"));
//	}

	// 一切、存在しない場合
	//

	public static void solve (int N, long[] aArray) {

		long mod = 1000000000 + 7;
		long result = 0;

		for (int i = 0; i < aArray.length; i++) {
			for (int j = i + 1; j < aArray.length; j++) {
//				System.out.println(aArray[i]);
//				System.out.println(aArray[j]);
//				System.out.println(aArray[i] * aArray[j]);
//				System.out.println(Math.floorMod ((aArray[i] * aArray[j]) , mod));
				result += Math.floorMod ((aArray[i] * aArray[j]) , mod);
//				result = Math.floorMod (result, mod);
			}
		}

		result = Math.floorMod (result , mod);

		System.out.println(result);

	}

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
			int N  = scanner.nextInt();
			scanner.nextLine();

			long[] aArray = new long[N];

			for (int i = 0; i < N ; i++) {
				aArray[i] = scanner.nextInt();
			}
			scanner.nextLine();

			solve(N, aArray);

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
		long end = System.currentTimeMillis();
		// System.out.println((end - start) );
	}


	// ************************************
	// Common
	// ************************************

	private static final int[] changeArrayStringToInt(String line) {

		String[] strArray = line.split(" ");

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}
