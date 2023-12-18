import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int n2 = 1 << n;
		String[] sa = br.readLine().split(" ");
		List<Integer> s = new ArrayList<>(n2);
		for (int i = 0; i < n2; i++) {
			s.add(Integer.parseInt(sa[i]));
		}
		br.close();

		Collections.sort(s);
		Collections.reverse(s);

		for (int i = 0; i < n; i++) {
			int b = 1 << i;
			for (int j = 0; j < b; j++) {
				if (s.get(j) <= s.get(j + b)) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
