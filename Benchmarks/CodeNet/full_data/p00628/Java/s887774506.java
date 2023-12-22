
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String s = scanner.nextLine();
			if (s.equals("END OF INPUT"))
				break;
			StringTokenizer t = new StringTokenizer(s);
			while(t.hasMoreTokens())
				System.out.print(t.nextToken().length());
			System.out.println();
		}
	}
}