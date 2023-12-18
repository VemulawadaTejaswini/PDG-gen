import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int x = sc.nextInt();
		final int y = sc.nextInt();
		final int z = sc.nextInt();

		int result = x / y;

		boolean endflag = false;
		while (!endflag) {
			if ((x - (result * y)) < ((z * result) + 1)) {
				result = result - 1;
				
			} else {
				endflag = true;
			}
		}
		System.out.print(result);

	}

}
