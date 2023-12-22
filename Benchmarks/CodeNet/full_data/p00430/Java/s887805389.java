import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (!str.equals("0")) {
			int n = Integer.parseInt(str);
			for (int i = n; i >= 1; i--)
				Search("" + i, n, i);
			str = br.readLine();
		}
	}

	private static void Search(String output, int l, int t) {
		if (l - t == 0) {
			System.out.println(output);
		} else {
			for (int i = Math.min(l - t, t); i >= 1; i--)
				Search(output + " " + i, l - t, i);
		}
	}
}