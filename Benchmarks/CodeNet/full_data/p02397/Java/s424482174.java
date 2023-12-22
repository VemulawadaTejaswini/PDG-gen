import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		PrintStream out = System.out;

		int val1, val2;
		do {
			val1 = scan.nextInt();
			val2 = scan.nextInt();
			if (val1 > val2) {
				int temp = val1;
				val1 = val2;
				val2 = temp;
			}
			if (val1 == 0 && val2 == 0) {
				break;
			}
			out.println(val1 + " " + val2);
		} while (val1 != 0 || val2 != 0);
	}
}