
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		String[] str = { "JOI", "IOI" };
		while (scanner.hasNext()) {
			String line = scanner.next();
			for (String s : str) {
				int p = 0;
				int ans = 0;
				while (true) {
					p = line.indexOf(s, p) + 1;
					if (p == 0)
						break;
				}
				System.out.println(ans);
			}
		}
	}
}