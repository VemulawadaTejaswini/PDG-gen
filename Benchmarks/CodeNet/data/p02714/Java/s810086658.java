import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String tmpS = sc.nextLine();

		String[] S = tmpS.split("");

		for (int i = 0; i < N; i++)
			System.out.println(S[i]);

		long sum = (long) 0;
		int badCnt = 0;
		for (int i = 0; i < N - 2; i++) {
			int cntA = 0;
			int cntB = 0;
			if (!S[i].equals(S[i + 1])
					&& !S[i].equals(S[i + 2])
					&& !S[i + 1].equals(S[i + 2])) {
				//badCnt++;
				//System.out.println("Bad!:" + i);
			}
			//System.out.println(i + "[i]:" + S[i]);
			for (int j = i + 1; j < N; j++) {
				int a = i - j;
				int b = j - i;

				System.out.println(j + ":" + S[j]);
				if (S[i].equals("R")) {
					if (S[j].equals("G")) {
						cntA++;
						if (a > 0 && a < N) {
							if (S[a].equals("B")) {
								badCnt++;
							}
						}
						if (b > 0 && b < N) {
							if (S[b].equals("B")) {
								badCnt++;
							}
						}
						if ((a + b) % 2 == 0 && (a + b) / 2 > 0 && (a + b) / 2 < N) {
							if (S[(a + b / 2)].equals("B")) {
								badCnt++;
							}
						}
					} else if (S[j].equals("B")) {
						cntB++;
						if (a > 0 && a < N) {
							if (S[a].equals("G")) {
								badCnt++;
							}
						}
						if (b > 0 && b < N) {
							if (S[b].equals("G")) {
								badCnt++;
							}
						}
						if ((a + b) % 2 == 0 && (a + b) / 2 > 0 && (a + b) / 2 < N) {
							if (S[(a + b / 2)].equals("G")) {
								badCnt++;
							}
						}
					}

				}

				if (S[i].equals("G")) {
					if (S[j].equals("R")) {
						cntA++;
						if (a > 0 && a < N) {
							if (S[a].equals("B")) {
								badCnt++;
							}
						}
						if (b > 0 && b < N) {
							if (S[b].equals("B")) {
								badCnt++;
							}
						}
						if ((a + b) % 2 == 0 && (a + b) / 2 > 0 && (a + b) / 2 < N) {
							if (S[(a + b / 2)].equals("B")) {
								badCnt++;
							}
						}
					} else if (S[j].equals("B")) {
						cntB++;
						if (a > 0 && a < N) {
							if (S[a].equals("R")) {
								badCnt++;
							}
						}
						if (b > 0 && b < N) {
							if (S[b].equals("R")) {
								badCnt++;
							}
						}
						if ((a + b) % 2 == 0 && (a + b) / 2 > 0 && (a + b) / 2 < N) {
							if (S[(a + b / 2)].equals("R")) {
								badCnt++;
							}
						}
					}
				}

				if (S[i].equals("B")) {
					if (S[j].equals("G")) {
						cntA++;
						if (a > 0 && a < N) {
							if (S[a].equals("R")) {
								badCnt++;
							}
						}
						if (b > 0 && b < N) {
							if (S[b].equals("R")) {
								badCnt++;
							}
						}
						if ((a + b) % 2 == 0 && (a + b) / 2 > 0 && (a + b) / 2 < N) {
							if (S[(a + b / 2)].equals("R")) {
								badCnt++;
							}
						}
					} else if (S[j].equals("R")) {
						cntB++;
						if (a > 0 && a < N) {
							if (S[a].equals("G")) {
								badCnt++;
							}
						}
						if (b > 0 && b < N) {
							if (S[b].equals("G")) {
								badCnt++;
							}
						}
						if ((a + b) % 2 == 0 && (a + b) / 2 > 0 && (a + b) / 2 < N) {
							if (S[(a + b / 2)].equals("G")) {
								badCnt++;
							}
						}
					}
				}
			}
			sum += cntA * cntB;
		}

		sum -= badCnt;
		System.out.println(sum);
		sc.close();
	}

}