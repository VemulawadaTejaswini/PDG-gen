import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String in = "";
		StringBuilder out = new StringBuilder();
		
		try {
			in = stdin.readLine();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Unexpected Error");
		}
		
		for (int i = 0; i < in.length(); ++i) {
			if (Character.isLowerCase(in.charAt(i)))
				out.append(Character.toUpperCase(in.charAt(i)));
			else
				out.append(Character.toLowerCase(in.charAt(i)));
		}
		
		System.out.println(out);
	}
}