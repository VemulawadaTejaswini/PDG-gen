import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int a = Integer.parseInt(sa[1]);
		int b = Integer.parseInt(sa[2]);
		br.close();

		if (n < a + b - 1 || a * b < n) {
			System.out.println(-1);
			return;
		}

		StringBuilder sb = new StringBuilder();
		int rem = b;
		int start = 0;
		int end = n;
		while (rem > 0) {
			start = Math.max(end - a + 1, rem);
			for (int i = start; i <= end; i++) {
				sb.append(i).append(' ');
			}
			end = start - 1;
			rem--;
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
