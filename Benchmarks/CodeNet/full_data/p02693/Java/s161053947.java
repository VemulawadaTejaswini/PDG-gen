import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			int k = Integer.parseInt(br.readLine());
			String in = br.readLine();
			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			String ans = "NG";

			for (int i = a; i <= b; i++) {
				if (i % k == 0) {
					ans = "OK";
					break;
				}
			}
			System.out.println(ans);
		}
	}
}