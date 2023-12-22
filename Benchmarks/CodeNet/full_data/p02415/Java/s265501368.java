import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String input = br.readLine();
			int i;
			String ret = "";
			for (i = 0; i < input.length(); i++) {
				String c = input.substring(i, i + 1);
				if (c == c.toLowerCase()) {
					ret = ret + c.toUpperCase();
				} else {
					ret = ret + c.toLowerCase();
				}
			}
			System.out.println(ret);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}