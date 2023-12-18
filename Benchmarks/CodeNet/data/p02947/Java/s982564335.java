import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
		String tmp[] = new String[10];
		String tmpStr;
		Map<String, Integer> map = new HashMap<String, Integer>();
		int answer = 0;

		for (int i = 0; i < N; i++) {
			tmpStr = sc.next();
			tmp = tmpStr.split("");
			Arrays.sort(tmp);
			s[i] = Arrays.toString(tmp);

			if (map.containsKey(Arrays.toString(tmp))) {
				int n = (int)map.get(Arrays.toString(tmp)) + 1;
				map.put(Arrays.toString(tmp), (n * (n + 1)) / 2);
			} else {
				map.put(Arrays.toString(tmp), 0);
			}
		}

		for (String key : map.keySet()) {
			answer += map.get(key);
		}
		System.out.println(answer);
	}
}
