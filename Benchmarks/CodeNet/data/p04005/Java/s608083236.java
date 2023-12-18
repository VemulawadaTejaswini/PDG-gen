
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long B = in.nextLong();
		long C = in.nextLong();
		System.out.println(C % 2 == 0 ? 0 : A * B);
		in.close();
	}
}