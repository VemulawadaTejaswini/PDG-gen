import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (set.contains(temp)) {
				set.remove(temp);
			} else {
				set.add(temp);
			}
		}
		System.out.println(set.size());
	}
}