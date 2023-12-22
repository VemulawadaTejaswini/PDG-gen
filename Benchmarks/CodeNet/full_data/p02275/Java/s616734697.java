import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	int n;
	int max;
	int a[];
	int b[];
	int c[];
	static final int MAX_INT = 10000;
	public static void main(String args[]) throws IOException {
		new Main().run();
	}
	Main() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		b = new int[n];
		c = new int[MAX_INT + 1];
		int index = 0;
		String line = br.readLine();
		for (int i = 0; i < n; i++) {
			int input = 0;
			while(true) {
				int ch = line.charAt(index);
				index++;
				if (ch != ' ') {
					input *= 10;
					input += ch - 48;
				} else {
					break;
				}
				if (index >= line.length()) break;
			}
			a[i] = input;
		}
	}
	void run() {
		for (int j = 0; j < n; j++) {
			c[a[j]]++;
		}
		for (int i = 1; i < MAX_INT; i++) {
			c[i] = c[i] + c[i-1];
		}
		for (int j = n - 1; j >= 0; j--) {
			b[c[a[j]] - 1] = a[j];
			c[a[j]]--;
		}
		for (int i = 0; i < n; i++) {
			System.out.print((i == 0? "" : " ") + b[i]);
		}
		System.out.println();;
	}
}
