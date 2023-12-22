import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			if ("0".equals(str)) {
				break;
			}
			int len = str.length();
			int sum = 0;
			for (int i = 0; i < len; i++) {
				int n = Integer.parseInt(String.valueOf(str.charAt(i)));
				sum += n;
			}
			System.out.println(sum);
		}
	}
}