import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
			int n  = scanner.nextInt();
			scanner.nextLine();
			String x  = scanner.next();
			scanner.nextLine();

			for (int i = 0; i < n; i++) {
				int count = 0;
				long val = 0;

				// 値が大きすぎるので初回だけは桁単位で計算する。
				String firstVal = createValBy(x, i);
				int  div = countLetter (firstVal, '1');
				if (div == 0) {
					System.out.println(count);
					continue;
				}
				count++;

				// 桁単位でmodして余りを足していく
				int pow = 0;
				for (int j = 0; j < firstVal.length(); j++) {
					if (pow != 0) {
						pow = pow / 2;
					}
					if (firstVal.charAt(j) == '0') {
						continue;
					}
//					int mod = (int)Math.pow(2, firstVal.length() - (j + 1)) % div;
					if (pow == 0) {
						pow = (1 <<  firstVal.length() - (j + 1));
					}
					int mod = pow % div;
					val = val + mod;
				}
				// 足したものをもう一度割って、div以下にする。
				val = val % div;

//				// divより小さくなるまで割り続けておく
//				while (true) {
//					val = val % div;
//					if (val < div) {
//						break;
//					}
//				}

				// divを現在の値で初期化
				div = countLetter (Long.toBinaryString(val), '1');
				if (div == 0) {
					System.out.println(count);
					continue;
				}

//				long  val = createVal(x, i);
//				if (val == 0) {
//					System.out.println(count);
//					continue;
//				}
//				long  div = countLetter (Long.toBinaryString(val), '1');

				while (true) {
					count++;
					val = popcount(val, div);
					if(val == 0) {
						break;
					}
					div = countLetter (Long.toBinaryString(val), '1');
				}
				System.out.println(count);
			}

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
		long end = System.currentTimeMillis();
		// System.out.println((end - start) );
	}

	private static String createValBy(String x, int keta) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < x.length(); i++) {
			if (i == keta) {
				if (x.charAt(i) == '0') {
					sb.append('1');
					continue;
				}
				sb.append('0');
				continue;
			}
			sb.append(x.charAt(i));
		}

		return sb.toString();
	}

	private static long createVal(String x, int keta) {

		return Long.parseLong(createValBy(x, keta));
	}


	private static int countLetter(String value,  char target) {

		int count = 0;

		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == target) {
				count++;
			}
		}
		return count;
	}


	private static long popcount(long val, long div) {
		return val % div;
	}

	// ************************************
	// Common
	// ************************************

	private static final int[] changeArrayStringToInt(String[] strArray) {

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}