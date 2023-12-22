import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float K = scan.nextFloat();
		float A = scan.nextFloat();
		float B = scan.nextFloat();

		if (K == 1) System.out.println("OK");
		else if (B / K - A / K >= 1f) System.out.println("OK");
		else System.out.println("NG");
	}
}