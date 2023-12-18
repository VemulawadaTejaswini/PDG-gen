import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int l = str.length();
		System.out.println("" + str.charAt(0) + (l - 2) + str.charAt(l - 1));
	}
}
