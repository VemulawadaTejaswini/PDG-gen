import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		int r = 0;
		if (a > b) {
			r += a--;
		} else {
			r += b--;
		}
		if (a > b) {
			r += a--;
		} else {
			r += b--;
		}
		System.out.println(r);
	}

}
