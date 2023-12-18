import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String n = r.readLine();
		String s = r.readLine();

		int t = s.split("ABC").length - 1;
		System.out.println(t);

		r.close();
	}
}