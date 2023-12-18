
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long B = in.nextLong();
		long C = in.nextLong();
		long divide = A * B;
		long red = C / 2;
		long blue = (C / 2 + C % 2);
		System.out.println(divide * Math.abs(blue - red));
		in.close();
	}
}