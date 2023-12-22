import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> numList01 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			numList01.add(i, scanner.nextInt());
		}
		int m = scanner.nextInt();
		ArrayList<Integer> numList02 = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			numList02.add(i, scanner.nextInt());
		}

		int count = 0;
		int mNum = (numList01.get(0) + numList01.get(n - 1)) / 2;

		for (int i = 0; i < m; i++) {

			if (numList02.get(m / 2) <= mNum) {
				for (int j = 0; numList02.get(j) <= mNum; j++) {
					if (numList01.get(i) == numList02.get(j)) {
						count++;
						break;
					}
				}
			} else {
				for (int j = m; numList02.get(j) <= mNum; j++) {
					if (numList01.get(i) == numList02.get(j))
						count++;
					break;
				}
			}
		}
		System.out.println(count);
		scanner.close();
	}
}