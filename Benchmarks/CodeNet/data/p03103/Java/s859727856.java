import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long M = scan.nextInt();

		Map<String, Long> map = new TreeMap<>();
		long ans = 0;
		for (int i = 0; i < N; i++) {
			map.put(scan.nextInt() + "_" + i, scan.nextLong());
		}
		long temp;
		for (String key : map.keySet()) {
			temp = map.get(key);
			if (M > temp) {
				M = M -temp;
				ans += Long.valueOf(key.substring(0, key.length() - 2)) * temp;
			} else {
				ans += Long.valueOf(key.substring(0, key.length() - 2)) * M;
				break;
			}
		}
		System.out.println(ans);
		scan.close();
	}
}
