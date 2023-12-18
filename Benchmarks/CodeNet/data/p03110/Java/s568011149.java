import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		sc.nextLine();
		
		double sum = 0;
		for (int i = 0; i < N; i++) {
			final String s = sc.nextLine();
			final String[] split = s.split(" ");
			final double x = Double.parseDouble(split[0]);
			final String type = split[1];
			
			if (type.equals("JPY")) {
				sum += x;
			} else if (type.equals("BTC")) {
				sum += (double) 380000 * x;
			}
		}
		
		System.out.println(sum);
	}

}