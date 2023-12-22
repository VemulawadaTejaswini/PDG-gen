import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int max = -1, min = 1001;
			int sum = 0;
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				int x = in.nextInt();
				sum += x;
				if (max < x) max = x;
				if (min > x) min = x;
			}
			System.out.println((sum - max - min) / (n - 2));
		}
	}
}