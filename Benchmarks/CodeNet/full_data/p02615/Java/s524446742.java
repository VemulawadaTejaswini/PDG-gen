import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] tmp = scanner.nextLine().split(" ");
		long[]  list = new long[n];
		long sum = 0;
		long min = Integer.MAX_VALUE;


		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(tmp[i]);

			min  = Math.min(min, list[i]);
			sum += list[i];

		}

		long ans = sum - min;

		System.out.println(ans);


	}
}