import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public int[] charCount = new int[128];

	public void count(String key) {
		charCount = new int[128];
		byte[] bStr = key.getBytes();
		for (byte b : bStr) {
			int index = (int) b;
			charCount[index]++;
		}
	}

	public int getCharCount(char ch) {
		return charCount[(int) ch];
	}

	public static void main(String[] args) throws IOException {
		Main cc = new Main();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		cc.count(str.toLowerCase());
		char ch = 'a';
		for (int i = 0; i <= ('z' - 'a'); i += 1) {
			char x = ch++;
			System.out.println(x + " : " + cc.getCharCount(x));
		}

	}
}