import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Joseph's Potato
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			LinkedList<Integer> list = new LinkedList<Integer>();

			for (int i = 1; i <= n; i++) {
				list.add(i);
			}

			while (list.size() >= m) {
				for (int i = 0; i < m - 1; i++) {
					list.addLast(list.removeFirst());
				}
				list.removeFirst();
			}
			System.out.println(list.peekLast());

		}

	}

}