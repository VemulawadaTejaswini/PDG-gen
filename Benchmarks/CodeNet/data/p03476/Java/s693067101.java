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

//		boolean[] isPrimeNum = new boolean[100001];
//		for (int i = 1; i <= 100000; i += 2) {
//			isPrimeNum[i] = true;
//		}
//		for (int i = 2; i <= 100000; i += 2) {
//			isPrimeNum[i] = false;
//		}
//		isPrimeNum[0] = false;
//		isPrimeNum[1] = false;
//		isPrimeNum[2] = true;
//		for (int i = 3; i <= 100000; i += 2) {
//			for (int j = 3; j * j <= i; j += 2) {
//				if (i % j == 0) {
//					isPrimeNum[i] = false;
//				}
//			}
//		}

//		for (int i = 1; i <= 10; i ++) {
//			System.out.println(i + " " + isPrimeNum[i]);
//		}

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

		for (int i = 0; i < q; i++) {
			int cnt = 0;
			int startIdx = l[i]; ;
			int remainder = l[i] % 4;
			if (remainder == 1) {
				startIdx = l[i];
			} else if (remainder == 0) {
				startIdx =  l[i] + 1;
			} else if (remainder == 2) {
				startIdx =  l[i] + 3;
			} else if (remainder == 3) {
				startIdx =  l[i] + 2;
			}
			if (startIdx <= r[i]) {
				for (int j = startIdx; j <= r[i]; j += 4) {
					if (isPrimeNum[j] && isPrimeNum[(j + 1) / 2]) {
						cnt++;
					}
				}
			}
			if (l[i] <= 3 && 3 <= r[i]) {
				cnt++;
			}
			System.out.println(cnt);
		}

	}

}
