import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();

		if ((A+B)%2 == 0) {
			System.out.println((A+B)/2);
		} else {
			System.out.println("IMPOSSIBLE ");
		}
	}
}
