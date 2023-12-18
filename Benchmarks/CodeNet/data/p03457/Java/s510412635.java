import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();

		boolean isOk = true;
		int[] a1 = new int[count];
		int[] a2 = new int[count];
		int[] a3 = new int[count];
		for (int i = 0; i < count; i ++) {
			a1[i] = s.nextInt();
			a2[i] = s.nextInt();
			a3[i] = s.nextInt();

			if (a1[i] < a2[i] + a3[i]) {
				isOk = false;
			}

			if (i == 0) {
				continue;
			}

			if (a1[i] - a1[i-1] > Math.abs(a2[i] - a2[i-1]) + Math.abs(a3[i] - a3[i-1])) {
				isOk = false;
			}
		}

		System.out.println(isOk ? "Yes" : "No");
	}

}
