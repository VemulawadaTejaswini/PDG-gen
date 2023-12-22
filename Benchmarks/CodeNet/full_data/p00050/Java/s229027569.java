import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = bf.readLine()) != null) {
			String[] s = line.split("apple");
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < s.length; i++) {
				if (i != 0) {
					sb.append("peach");
				}
				sb.append(s[i].replaceAll("peach", "apple"));
			}
			System.out.println(sb.toString());
		}
	}
}