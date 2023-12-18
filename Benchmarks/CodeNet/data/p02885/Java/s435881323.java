import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);

		if ((a - b * 2) > 0) {
			System.out.println(a - b * 2);
		} else {
			System.out.println(0);
		}
	}
}