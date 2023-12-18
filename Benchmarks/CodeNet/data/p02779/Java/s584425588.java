import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);
			if (set.contains(a)) {
				System.out.println("NO");
				return;
			} else
				set.add(a);
		}
		System.out.println("YES");
	}
}
