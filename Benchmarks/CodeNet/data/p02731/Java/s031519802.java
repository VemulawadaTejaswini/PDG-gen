import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int L = scan.nextInt();

		long max = -1;
		
		for (int i = L - 2; i >= 1; i--) {
			for (int k = L - i - 1; k >= 1; k--) {
				long m = i * k * (L - i - k);
				max = Math.max(max, m);
			}
		}
		System.out.println(max);
	}

}