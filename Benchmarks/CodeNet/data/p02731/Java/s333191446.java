import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int L = scan.nextInt();

		double max = -1;
		
		for (double i = L - 2; i > 0; i-=0.1) {
			for (double k = L - i - 1; k > 0; k-=0.1) {
				double m = i * k * (L - i - k);
				max = Math.max(max, m);
			}
		}
		System.out.println(max);
	}

}
