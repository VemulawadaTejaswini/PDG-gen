import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		int n = str.length;

		ArrayList<Integer> R = new ArrayList<>();
		ArrayList<Integer> L = new ArrayList<>();

		int a[] = new int[n];

		for (int i = 0; i < n - 1; i++) {
			if (str[i].equals("R") && str[i + 1].equals("L")) {
				R.add(i);
				L.add(i + 1);
				a[i] = 1;
				a[i + 1] = 1;
			}
		}

		for (int i = 0; i < n; i++) {
			if (R.contains(i) || L.contains(i)) {
				continue;
			}

			a[i] = 0;

			int min = Integer.MAX_VALUE;
			int index = 0;

			if (str[i].equals("R")) {
				for (int j = 0; j < R.size(); j++) {
					if (R.get(j) > i) {
						if (min > R.get(j) - i) {
							min = R.get(j) - i;
							index = R.get(j);
						}
					}
				}
			} else {
				for (int j = 0; j < L.size(); j++) {
					if (L.get(j) < i) {
						if (min > i - L.get(j)) {
							min = i - L.get(j);
							index = L.get(j);
						}
					}
				}
			}

			if (min % 2 == 0) {
				a[index]++;
			} else {
				if (str[i].equals("R"))
					a[index + 1]++;
				else
					a[index - 1]++;
			}
		}

		System.out.print(a[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + a[i]);
		}
	}
}
