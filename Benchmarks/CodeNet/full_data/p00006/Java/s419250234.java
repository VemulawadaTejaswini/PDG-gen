import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String line = br.readLine();
			int i = line.length();
			StringBuilder sb = new StringBuilder();
			while (i > 0) {
				sb.append(line.substring(i - 1, i));
				i--;
			}
			System.out.println(sb);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}