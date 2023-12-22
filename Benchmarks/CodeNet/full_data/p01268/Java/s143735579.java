import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> prime = new ArrayList<>();
		for (int i = 0; i < 200000; i++) {
			if (isPrime(i)) {
				prime.add(i);
			} else {
				prime.add(-1);
			}
		}

		while (true) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int p = Integer.parseInt(str[1]);

			if (n == -1 && p == -1)
				break;

			int list[] = new int[p + 1];
			int count = 0;
			for (int i = n + 1;; i++) {
				if (prime.get(i) == -1)
					continue;
				else {
					list[count] = prime.get(i);
					count++;
				}
				if (count == p + 1)
					break;
			}
			ArrayList<Integer> ans = new ArrayList<>();
			for (int i = 0; i <= p; i++) {
				for (int j = i; j <= p; j++) {
					ans.add(list[i] + list[j]);
				}
			}
			Collections.sort(ans);
			System.out.println(ans.get(p - 1));
		}
	}

	static boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
