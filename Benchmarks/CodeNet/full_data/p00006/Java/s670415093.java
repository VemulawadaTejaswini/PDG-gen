import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String line = br.readLine();
			StringBuilder sb = new StringBuilder(line);
			String result = sb.reverse().toString();
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}