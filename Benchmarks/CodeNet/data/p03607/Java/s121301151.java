import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());

			if (list.indexOf(num) == -1) {
				list.add(num);
			} else {
				list.remove(list.indexOf(num));
			}
		}
		System.out.println(list.size());
	}
}