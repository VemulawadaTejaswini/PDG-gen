import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			@SuppressWarnings("unused")
			String top = br.readLine();
			String down = br.readLine();

			char[] topTmp = top.toCharArray();
			char[] downTmp = down.toCharArray();

			char[] turnDown = new char[top.length()];
			char[] turnTop = new char[top.length()];

			for (int i = 0; i < top.length(); i++) {
				turnDown[i] = topTmp[top.length() - 1 - i];
				turnTop[i] = downTmp[top.length() - 1 - i];
			}

			if (top.equals(new String(turnTop)) && down.equals(new String(turnDown))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}
