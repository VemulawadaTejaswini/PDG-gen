import java.util.Scanner;

//
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		long c = input.nextLong();
		if ((double) ((double) Math.sqrt(a) + (double) Math.sqrt(b)) < (double) Math.sqrt(c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
