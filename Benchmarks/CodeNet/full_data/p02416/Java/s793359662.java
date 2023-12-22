import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x; int sum;
		while (true) {
			x = scan.next();
			sum = 0;
			if (x.equals("0")) break;
			for (int i = 0; i < x.length(); i++) {
				sum += Character.getNumericValue(x.charAt(i));
			}
			System.out.println(sum);
		}
	}

}