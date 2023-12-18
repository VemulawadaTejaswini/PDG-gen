import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long user = input.nextLong();
		int function = 1;
		
		for (long i = user; i >= 2; i -= 2) {
			function *= i;
		}
		
		int counter = 0;
		for (int i = 1; i < String.valueOf(function).length(); i++) {
			if (function % Math.pow(10, i) == 0) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
