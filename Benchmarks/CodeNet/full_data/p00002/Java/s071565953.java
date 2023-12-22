import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;

		while((str = br.readLine()) != null) {
			String[] num = str.split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);

			int digitnum = String.valueOf(a + b).length();
			System.out.println(digitnum);
		}
	}
}