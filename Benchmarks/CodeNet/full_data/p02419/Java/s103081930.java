import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String w = scan.nextLine().toLowerCase();
		int count = 0;
		while (true) {
			String t = scan.next();
			if (t.equals("END_OF_TEXT")) break;
			else if (t.toLowerCase().equals(w)) count++;
		}
		scan.close();
		System.out.println(count);
	}
}