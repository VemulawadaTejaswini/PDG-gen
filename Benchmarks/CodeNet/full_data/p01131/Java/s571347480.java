import java.util.Scanner;

public class　Main {
	public static void main(String[] args) {

		char[][] data = { { '.', ',', '!', '?', ' ' }, { 'a', 'b', 'c' },
				{ 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
				{ 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' },
				{ 'w', 'x', 'y', 'z' } };

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			String str = s.next();
			int keta = str.length();

			int[] input = new int[keta];
			char[] inputc = new char[keta];
			String output = new String();

			for (int k = 0; k < keta; k++) {
				inputc[k] = str.charAt(k);
				// input[k] = Integer.parseInt("" + inputc[k]);
				input[k] = inputc[k] - '0';
				// System.out.println(input[k]);
			}

			// 以下、数字を文字列に直す処理をかく

			int in_count = 0;
			// int out_count = 0;
			int start;

			for (int m = 0; m < keta - 1; m++) {
				start = input[m];
				if (start == 0) {

				} else if (input[m + 1] == start) {
					in_count++;
				} else {
					int d = 3;
					if (start == 7 || start == 9)
						d = 4;
					else if (start == 1)
						d = 5;
					output += data[start - 1][in_count % d];
					// out_count++;
					in_count = 0;
				}
			}

			/*
			 * for (int t = 0; t < output.length; t++) { if (output[t] !=
			 * '\u0000') System.out.print(output[t]); }
			 */
			System.out.println(output);
		}
		s.close();
	}
}