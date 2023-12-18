import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int sum = 0;
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			x[i] = j;
		}

		for (int j = 1; j <= 100; j++) {
			int sum2 = 0;
			for (int i = 0; i < n; i++) {
				sum2 += (int) Math.pow(x[i] - j, 2);
			}
			if (j == 1)
				sum = sum2;
			if (sum > sum2)
				sum = sum2;
		}
		System.out.println(sum);
		kb.close();
	}

}
