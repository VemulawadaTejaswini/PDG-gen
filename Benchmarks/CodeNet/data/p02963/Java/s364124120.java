
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();

		long x = 1000000000 - S%1000000000;
		long y = S/1000000000 + (S%1000000000 == 0 ? 0 : 1);
		System.out.println("0 0 1000000000 1 " + x + " " + y);
	}
}