import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean[] isClear = new boolean[N];

		for (int i = 0; i < N; i++)
			isClear[i] = false;

		int cntCorrect = 0;
		int cntWrong = 0;
		sc.nextLine();
		for (int j = 0; j < M; j++) {
			int num = sc.nextInt() - 1;
			String result = sc.nextLine();
			if (!isClear[num]) {
				if (result.equals(" AC")) {
					isClear[num] = true;
					cntCorrect++;
				} else {
					cntWrong++;
				}
			}
		}

		System.out.println(cntCorrect + " " + cntWrong);

		sc.close();

	}

}