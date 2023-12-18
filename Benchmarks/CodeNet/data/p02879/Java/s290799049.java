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

		if (a < 10 && b < 10) {
			System.out.println(a * b);
		} else {
			System.out.println(-1);
		}
	}
}
