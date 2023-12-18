import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		final int X = Integer.parseInt(str);
		
		if (X == 3 || X == 5 || X == 7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
