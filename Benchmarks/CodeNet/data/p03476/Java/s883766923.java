import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		boolean[] isPrimeNum = new boolean[100001];
		for (int i = 1; i <= 100000; i += 2) {
			isPrimeNum[i] = true;
		}
		isPrimeNum[0] = false;
		isPrimeNum[1] = false;
		isPrimeNum[2] = true;
		for (int i = 3; i * i <= 100000; i += 2) {
			if (isPrimeNum[i] == true) {
				for (int j = i * i; j <= 100000; j += i * 2) {
					isPrimeNum[j] = false;
				}
			}
		}

		int[] numOfLikeNumber = new int[100001];
		numOfLikeNumber[1] = 0;
		numOfLikeNumber[2] = 0;
		numOfLikeNumber[3] = 1;
		for (int i = 4; i <= 100000; i++) {
			numOfLikeNumber[i] = numOfLikeNumber[i - 1];
			if (i % 4 == 1) {
				if (isPrimeNum[i] && isPrimeNum[(i + 1) / 2]) {
					numOfLikeNumber[i]++;
				}
			}
		}

		for (int i = 0; i < q; i++) {
			System.out.println(numOfLikeNumber[r[i]] - numOfLikeNumber[l[i] - 1]);
		}

	}

}
