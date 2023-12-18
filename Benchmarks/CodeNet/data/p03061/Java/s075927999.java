import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			String str;
			int N = 0, result = 0;

			Scanner sc = new Scanner(System.in);
			N = Integer.parseInt(sc.nextLine());
			str = sc.nextLine();

			int[] A = new int[N];
			int maxNum = 0;

			for (int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(str.split(" ")[i]);
				if (maxNum < A[i]) {
					maxNum = A[i];
				}
			}

			int harfMaxNum = maxNum / 2;

			int count = 0;
			boolean sameNumFlg = true;

			for (int i = 0; i < N - 1; i++) {
				if (A[i] != A[i + 1]) {
					sameNumFlg = false;
				}
			}

			if (!sameNumFlg) {
				for (int i = harfMaxNum; 0 < i; i--) {
					count = 0;
					for (int j = 0; j < N; j++) {
						if (A[j] % i != 0) {
							count++;
						}
					}
					if (count == 1) {
						result = i;
						break;
					}
				}
			} else {
				result = A[0];
			}

			System.out.print(result);

			sc.close();
		}
}
