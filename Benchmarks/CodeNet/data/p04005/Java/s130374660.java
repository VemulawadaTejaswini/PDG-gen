
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextInt();
		long sum =A * B *C;

		if (sum % 2 == 0) {
			System.out.println(0);
		}else {
			System.out.println(sum - ((A - 1) * B * C));
		}

	}

}
