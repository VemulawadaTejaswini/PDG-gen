import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[] numArr = new int[N];
		int n = 0;
		int r = 1000000;
		int diff = 1000000;
		int tmp = 1000000;

		for (int i = 0; i < N; i++) {
			numArr[i] = s.nextInt();
			n = Math.max(n, numArr[i]);
		}
		for (int j = 0; j < N; j++) {
			tmp = Math.abs(n / 2 - numArr[j]);
			if (tmp < diff) {
				diff=tmp;
				r = numArr[j];
			}
		}

		System.out.println(n + " " + r);
	}
}
