import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = br.readLine();
			if ("-".equals(line))
				break;

			String str = line;
			Integer cnt = Integer.parseInt(br.readLine());
			for (int i = 0; i < cnt; i++) {
				int h = Integer.parseInt(br.readLine());
				str = str.substring(h) + str.substring(0, h);
			}

			System.out.println(str);
		}
		if (br != null) {
			br.close();
			br = null;
		}
	}
}