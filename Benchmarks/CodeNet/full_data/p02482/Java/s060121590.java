import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long a = in.nextLong();
		long b = in.nextLong();
		String ret;
		if (a < b) {
			ret = "a < b";
		} else if (a > b) {
			ret = "a > b";
		} else {
			ret = "a = b";
		}
		System.out.println(ret);
	}

}