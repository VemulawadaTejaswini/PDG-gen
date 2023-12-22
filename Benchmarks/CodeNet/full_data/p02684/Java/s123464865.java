import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long k = Long.parseLong(str[1]);

		int a[] = new int[n];
		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]) - 1;
		}
		int size = dfs(a, 0);
		long index = k % size;

		System.out.println(a[(int) index] + 1);
	}

	static int dfs(int a[], int now) {
		int size = 0;
		while (true) {
			if (list.contains(now)) {
				int n = list.indexOf(now);
				size = list.size() - n;
				break;
			}
			list.add(now);
			now = a[now];
		}
		return size;
	}
}
