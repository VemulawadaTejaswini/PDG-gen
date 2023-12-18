import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			int p = sc.nextInt();
			if (max < p) max = p;
			sum += p;
		}

		System.out.println(sum - max / 2);
	}
}
