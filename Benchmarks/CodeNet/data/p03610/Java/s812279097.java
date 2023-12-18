import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 0) {
				b += a.substring(i, i + 1);
			}
		}
		System.out.println(b);
	}

}