

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		int k = scan.nextInt();
		scan.close();

//		System.out.println(n + " " + k);

		long ans = 0;
		for (long num = 1; num <= n; num++) {
			boolean flg = false;
			String numStr = Long.toBinaryString(num);

			System.out.println("numStr " + num + " : " + numStr);

			int index = 0;
			for (int kCnt = 0; kCnt < k; kCnt++) {
				int indexOf = numStr.indexOf("1", index);
				System.out.println(kCnt + " " + index);
				if (indexOf < 0) {
					flg = true;
					break;
				}
				index = indexOf + 1;
			}

			if (numStr.indexOf("1", index) > 0) {
				flg = true;
			}


			if (!flg) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}
