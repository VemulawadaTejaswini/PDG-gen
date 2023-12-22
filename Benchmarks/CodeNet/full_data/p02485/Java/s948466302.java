import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String in = scan.nextLine();
			if (in.equals("0"))
				break;
			char[] x = in.toCharArray();
			int sum = 0;
			for (int i = 0; i < x.length; i++) {
				sum += Character.getNumericValue(x[i]);
			}
			System.out.println(sum);
		}
	}
}