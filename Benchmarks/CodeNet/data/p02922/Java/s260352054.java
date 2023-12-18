import java.util.Scanner;

public class Main {

	public static final long CONST = 100000007L;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numA = scan.nextInt();
		int numB = scan.nextInt();

		int count = 1;
		int max = numA;

		while (true) {
			if (max >= numB) {
				break;
			}
			count++;
			max += numA - 1;
		}
		System.out.println(count);
	}
}
