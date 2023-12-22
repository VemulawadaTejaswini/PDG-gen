import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] t = new int[n];

		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}

		int max = (int) Math.pow(10, 9) * -1;
		int min = t[0];

		for (int i = 1; i < n; i++) {
			if (max < t[i] - min) {
				max = t[i] - min;
			}
			min = min > t[i] ? t[i] : min;
		}
		System.out.println(max);
	}

}