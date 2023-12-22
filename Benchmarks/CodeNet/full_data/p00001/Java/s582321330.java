import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Top3 {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);
		Collections.reverse(list);

		for (int i = 0; i <= 2; i++) {
			System.out.println(list.get(i));
		}

	}

}