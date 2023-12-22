import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Random rnd = new Random();
		byte n = scan.nextByte();
		for (int i = 0; i < n ; i++) {
			scan.next();
		}
		for (int i = 0; i < 1000; i++) {
			out.println(rnd.nextInt(n)+1);
		}
		out.flush();
	}
}