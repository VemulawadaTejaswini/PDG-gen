import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder answer = new StringBuilder();
			String lb = System.getProperty("line.separator");
			
			String str = input.readLine();
			int m;
			int h;
			while (!str.equals("-")) {
				m = Integer.parseInt(input.readLine());

				for (int i = 0; i < m; i++) {
					h = Integer.parseInt(input.readLine());
					str = (str.substring(h, str.length()) + str.substring(0, h));
				}
				answer.append(str).append(lb);
				str = input.readLine();
			}
			
			System.out.print(answer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isNumber (String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}