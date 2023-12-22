import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0)
				break;

			ArrayList<Integer> a = new ArrayList<>();
			long ave = 0;

			String str[] = br.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				a.add(Integer.parseInt(str[i]));
				ave += a.get(i);
			}
			ave /= n;

			int ans = 0;
			for (int num : a) {
				if (num <= ave)
					ans++;
			}
			System.out.println(ans);
		}
	}
}
