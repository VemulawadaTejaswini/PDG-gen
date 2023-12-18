import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n = sc.nextInt();
		int m = sc.nextInt();

		int guessno = 0;

		int tmpnos1 = 0;
		int tmpnos2 = 0;
		int tmpnos3 = 0;
		int tmpnoc1 = -1;
		int tmpnoc2 = -1;
		int tmpnoc3 = -1;

		boolean dameflg = false;
		boolean twokaiflg1 = false;
		boolean twokaiflg2 = false;
		boolean twokaiflg3 = false;

		for (int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();

			if (s == 1) {
				if (s == tmpnos1) {
					if (!(c == tmpnoc1)) {
						dameflg = true;
						break;
					}
				}
				tmpnos1 = s;
				tmpnoc1 = c;
				if (!twokaiflg1) {
					guessno += Math.pow(10, (n - s)) * c;
				}
				twokaiflg1 = true;
			}

			if (s == 2) {
				if (s == tmpnos2) {
					if (!(c == tmpnoc2)) {
						dameflg = true;
						break;
					}
				}
				tmpnos2 = s;
				tmpnoc2 = c;
				if (!twokaiflg2) {
					guessno += Math.pow(10, (n - s)) * c;
				}
				twokaiflg2 = true;
			}

			if (s == 3) {
				if (s == tmpnos3) {
					if (!(c == tmpnoc3)) {
						dameflg = true;
						break;
					}
				}
				tmpnos3 = s;
				tmpnoc3 = c;
				if (!twokaiflg3) {
					guessno += Math.pow(10, (n - s)) * c;
				}
				twokaiflg3 = true;
			}

			if (s == 1 && c == 0) {
				if (!(n == 1)) {
					dameflg = true;
					break;
				}
			}

		}
		if (dameflg || m == 0) {
			System.out.println(-1);
		} else {
			System.out.println(guessno);
		}
	}
}
