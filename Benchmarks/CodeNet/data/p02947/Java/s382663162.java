import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String[] s = new String[N];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			s[i] = sc.nextLine();

			int code = 0;
			for (int k = 0; k < 10; k++) {
				char c = s[i].substring(k, k + 1).charAt(0);
				code += Character.getNumericValue(c);
			}
			map.put(i, code);
		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int ci = map.get(i);
			for (int j = i + 1; j < N; j++) {
				int cj = map.get(j);
				if (ci == cj) cnt++;
			}
		}

		System.out.println(cnt);
	}
}