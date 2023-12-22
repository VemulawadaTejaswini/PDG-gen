import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum;
		String str[];
		while (!br.ready()) {
			try {
				str = br.readLine().split(" ");
				sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
				System.out.println(Integer.toString(sum).length());
			} catch (NumberFormatException e) {
				return;
			}
		}
	}
}