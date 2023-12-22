import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 10; i++) {
			list.add(br.readLine());
		}
		Collections.sort(list, (s1, s2) -> Integer.parseInt(s2) - Integer.parseInt(s1));

		for(int i = 0; i < 3; i++) {
			System.out.println(list.get(i));
		}
	}
}