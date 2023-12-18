import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long k = Long.parseLong(str[1]);

		int a[] = new int[n];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]) - 1;
		}

		int path[] = new int[200000];
		Arrays.fill(path, -1);

		Set<Integer> set = new HashSet<>();
		int next = 0;
		int count = 0;

		while (!set.contains(next)) {
			path[count] = next;
			set.add(next);
			count++;
			next = a[next];
		}

		int pred = 0;
		for (int i = 0; i < path.length; i++) {
			if (path[i] == next) {
				pred = i;
			}
		}
		int hsize = count - pred - path[0];

		if (k < path[next]) {
			System.out.println(path[(int) k] + 1);
		} else {
			System.out.println(path[(int) (k - pred) % hsize + pred] + 1);
		}
	}
}
