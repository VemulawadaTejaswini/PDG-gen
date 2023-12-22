
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[] name = scanner.next().toCharArray();
		int namelen = name.length;
		int ans = 0;
		loop: while (n-- > 0) {
			char[] c = scanner.next().toCharArray();
			int clne = c.length;
			for (int i = 0; i < clne - namelen + 1; i++) {
				lo: for (int j = 1; (namelen - 1) * j + i < clne; j++) {
					for (int k = 0; k < namelen; k++) {
						if (name[k] != c[i + j * k])
							continue lo;
					}
					ans++;
					continue loop;
				}
			}
		}
		System.out.println(ans);

	}
}