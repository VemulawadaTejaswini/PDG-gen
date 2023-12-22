import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		String line2 = "0";
		int sum = 0, i = 0;
		int number = line.length();
		while (line.charAt(0) != 0) {
			for (i = 0; i < number; i++) {
				sum = sum + (line.charAt(i) - line2.charAt(0));
			}
			System.out.println(sum);
			line = scan.next();
		}

	}

}