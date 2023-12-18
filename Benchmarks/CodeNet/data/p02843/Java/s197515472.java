
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int num = X / 100;
		int r = X % 100;
		int count = 0;
		count += r / 5;
		r %= 5;
		count += r / 4;
		r %= 4;
		count += r / 3;
		r %= 3;
		count += r / 2;
		r %= 2;
		count += r / 1;
		System.out.println(count <= num ? 1 : 0);
		in.close();
	}
}