import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
		
	}
	
	private static void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int N = Integer.parseInt(str.substring(0, str.indexOf(" ")));
		int X = Integer.parseInt(str.substring(str.indexOf(" ") + 1, str.length()));
		
		System.out.println(4 * (N - X));
		
	}
}
