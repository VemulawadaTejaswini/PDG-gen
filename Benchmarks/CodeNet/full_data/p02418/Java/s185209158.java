import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		char[] s = br.readLine().toCharArray();
		String p = br.readLine();
		int point;
		Boolean flag = false;

		for(int i = 0; i < s.length; i++) {
			point = i;
			for(int j = 0; j < p.length(); j++) {
				if(point == s.length) {
					point = 0;
				}
				sb.append(s[point]);
				point++;
			}

			if(sb.toString().equals(p)) {
				flag = true;
				break;
			}
			sb.setLength(0);
		}

		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}