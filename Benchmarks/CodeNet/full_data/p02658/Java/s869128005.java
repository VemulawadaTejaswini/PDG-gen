package problemB;

import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		process: {
			int num = sc.nextInt();
			String[] input = new String[num];
			for (int j = 0; j < num; j++) {
				input[j] = sc.next();
			}
			for (int k = 0; k < num; k++) {
				if (input[k].length() >= 18) {
					System.out.println(-1);
					break process;
				}

			}
			long[] inputArray = new long[num];
			for (int k = 0; k < num; k++) {

				inputArray[k] = Long.parseLong(input[k]);

			}
			long ans = inputArray[0];
			for (int i = 1; i < num; i++) {
				ans = ans * inputArray[i];
			}
			long ser = ans;
			int j = 0;
			while (j < 18) {
				ans = ans / 10;
				j = j + 1;
			}

			if (ans >= 1) {
				System.out.println(-1);
			} else {
				System.out.println(ser);
			}
			sc.close();
		}
	}// main
}
// class