import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int n = Integer.parseInt(br.readLine());
		StringBuilder temp;
		for (int i = 0; i < n; i++) {
			String[ ] splitCommand = br.readLine().split(" ");
			int a = Integer.parseInt(splitCommand[1]);
			int b = Integer.parseInt(splitCommand[2]);
			if (splitCommand[0].startsWith("p")) {
				// ????????????print a b????????´???
				System.out.println(sb.substring(a, b + 1));
			} else if (splitCommand[0].startsWith("rev")) {
				// ????????????reverse a b????????´???
				temp = new StringBuilder(sb.substring(a, b + 1));
				temp.reverse();
				sb.replace(a, b + 1, new String(temp));
			} else {
				// ????????????replace a b p????????´???
				String p = splitCommand[3];
				sb.replace(a, b + 1, p);
			}
		}
	}
}