import java.io.BufferedReader;

public class XCubic {
	public static void main(String[] args) {
		System.out.println("Please input x:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s = reader.readLine();
			int x = Integer.parseInt(s);
			System.out.println(x * x * x);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}