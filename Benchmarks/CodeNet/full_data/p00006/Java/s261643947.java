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
			/*
			while (i > 0) {sb.append(line.substring(i));
				i--;
			} */
			String result = sb.reverse().toString();
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}