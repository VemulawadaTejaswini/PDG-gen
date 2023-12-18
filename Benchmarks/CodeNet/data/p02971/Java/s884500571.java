import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		int num;
		for (int i = 0; i < N; i++) {
			num = sc.nextInt();
			A[i] = num;
		}

		for (int i = 0; i < N; i++) {
			int maxNum = -1;
			for (int j = 0; j < N; j++) {
				if (i != j) {
					maxNum = Math.max(maxNum, A[j]);
				}
			}
			System.out.println(maxNum);
		}
	}

}
