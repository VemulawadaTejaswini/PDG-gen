import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int sum;
		while(true) {
			String line = br.readLine();
			if("0".equals(line)) {
				break;
			}
			char[] c = line.toCharArray();
			sum = 0;
			for(int i = 0; i < c.length; ++i) {
				sum += Character.getNumericValue(c[i]);
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}