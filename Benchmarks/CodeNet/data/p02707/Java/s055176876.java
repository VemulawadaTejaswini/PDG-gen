import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			map.put(i, 0);
		}

		for (int i = 0; i < n - 1; i++) {
			int a = Integer.parseInt(str[i]);

			map.put(a, map.get(a) + 1);
		}

		for (int i : map.keySet()) {
			System.out.println(map.get(i));
		}
	}
}