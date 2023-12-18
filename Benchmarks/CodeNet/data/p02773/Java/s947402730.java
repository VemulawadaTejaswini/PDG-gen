import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String S[] = new String[N];
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			S[i] = sc.nextLine();
		}

		Arrays.sort(S);

		int cnt = 1;
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < N - 1; i++) {
			if (S[i].equals(S[i + 1])) {
				cnt++;
			} else {
				map.put(S[i], cnt);
				cnt = 1;
			}
		}

		if (S[N - 2].equals(S[N - 1])) {
			map.put(S[N - 1], cnt);
		} else {
			map.put(S[N - 2], cnt);
			map.put(S[N - 1], 1);
		}

		int maxcnt = 0;
		
		ArrayList<String> str = new ArrayList<>();

		for (String key : map.keySet()) {
			if (map.get(key) > maxcnt)
				maxcnt = map.get(key);
		}
		
		for (String key : map.keySet()) {
			if (map.get(key) == maxcnt)
				str.add(key);
		}
		
		Collections.sort(str);
		for (String s : str) {
			System.out.println(s);
		}

		sc.close();

	}
}