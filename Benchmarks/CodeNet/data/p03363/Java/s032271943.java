import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static void inc(Map<Long, Integer> map, long value) {
		Integer nVal = map.get(value);
		nVal = nVal == null ? 1 : nVal + 1;
		map.put(value, nVal);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = sc.nextInt();
		Map<Long, Integer> acums = new HashMap<>();
		long acum = 0, tmp;
		inc(acums, acum);
		for (int i = 0; i < N; i++) {
			tmp = sc.nextInt();
			acum += tmp;
			inc(acums, acum);
		}
		long ans = 0;
		for (int cant : acums.values()) {
			ans += cant * (long) (cant - 1) / 2;
		}
		System.out.println(ans);
	}
}
