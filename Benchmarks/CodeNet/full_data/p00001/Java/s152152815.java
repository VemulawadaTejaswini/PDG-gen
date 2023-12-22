import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Top3 {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		ArrayList<Integer> list = new ArrayList<Integer>();

		while ((line = br.readLine()) != null) {
			list.add(Integer.parseInt(line));
		}

		Collections.sort(list);
		Collections.reverse(list);

		for (int i = 0; i <= 2; i++) {
			System.out.println(list.get(i));
		}

	}

}