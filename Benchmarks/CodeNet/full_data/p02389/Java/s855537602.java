import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int a = Integer.parseInt(s);

		s = br.readLine();
		int b = Integer.parseInt(s);

		System.out.println(a*b);

		System.out.println(a + a + b + b);
	}
}