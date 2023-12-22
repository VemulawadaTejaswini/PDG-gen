import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long[] ai = new long[(int) n];
		long max = -1000001;
		long min = 1000001;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			ai[i] = scan.nextLong();
			if (max < ai[i]) {
				max = ai[i];
			}
			if (min > ai[i]) {
				min = ai[i];
			}
			sum = sum + ai[i];
		}
		System.out.print(min + " ");
		System.out.print(max + " ");
		System.out.println(sum);
	}
}