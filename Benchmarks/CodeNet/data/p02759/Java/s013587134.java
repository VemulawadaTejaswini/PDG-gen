import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static List<String> values = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String l1 = r.readLine();
		int p = Integer.parseInt(l1);

		System.out.println(p / 2 + p % 2);

		r.close();
	}
}