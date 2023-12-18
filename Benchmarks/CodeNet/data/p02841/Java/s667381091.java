import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M1 = sc.nextInt();
		int D1 = sc.nextInt();
		int M2 = sc.nextInt();
		int D2 = sc.nextInt();
		int answer = 0;

		int D30[] = new int[] {4, 6, 9, 11};
		int D31[] = new int[] {1, 3, 5, 7, 8, 10, 12};

		for (int i = 0; i < 4; i++) {
			if (M1 == D30[i] && D1 == 30) {
				answer++;
			}

			if (M2 == D30[i] && D2 == 30) {
				answer++;
			}
		}

		for (int i = 0; i < 7; i++) {
			if (M1 == D31[i] && D1 == 31) {
				answer++;
			}

			if (M2 == D31[i] && D2 == 31) {
				answer++;
			}
		}

		if (M1 == 2 && D1 == 28) {
			answer++;
		}

		if (M2 == 2 && D2 == 28) {
			answer++;
		}

		System.out.println(answer);
	}
}
