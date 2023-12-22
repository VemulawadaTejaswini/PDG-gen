import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String line = br.readLine();
		List<String> l = Arrays.asList(line.split(" "));
		Collections.reverse(l);
		for (int i = 0; i < l.size(); i++) {
			if (i != 0)
				System.out.print(" ");
			System.out.print(l.get(i));
		}
		System.out.println();
	}
}