import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long user = input.nextLong();
		
		if (user % 2 == 0) {
			if (user < 10) {
				System.out.println("0");
			} else {
				System.out.println(user / 10);
			}
		} else {
			System.out.println("0");
		}
	}
}
