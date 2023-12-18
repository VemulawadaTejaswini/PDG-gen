import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < k; i++) {
			int d = Integer.parseInt(br.readLine());
			str = br.readLine().split(" ");
			for (int j = 0; j < d; j++) {
				int a = Integer.parseInt(str[j]);
				set.add(a);
			}
		}

		System.out.println(n - set.size());
	}
}
