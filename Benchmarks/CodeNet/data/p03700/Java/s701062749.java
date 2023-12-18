import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long sum = 0;
		long[] h = new long[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = scanner.nextLong();
			sum += h[i];
		}
		long min = sum/(a+b*(n-1));
		if(sum%(a+b*(n-1))!=0) {
			min += 1;
		}
			System.out.println(min);
	}
}