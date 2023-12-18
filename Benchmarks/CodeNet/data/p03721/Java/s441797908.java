import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		Map<Integer, Integer> numCount = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			int bi = sc.nextInt();
			if (!numCount.containsKey(ai)) {
				numCount.put(ai, bi);
			} else {
				int c = numCount.get(ai);
				numCount.put(ai, c + bi);
			}
		}

		Integer[] keys = numCount.keySet().toArray(new Integer[numCount.size()]);
		Arrays.sort(keys);

		int cnt = 0;
		for (int i = 0; i < keys.length; i++) {
			cnt += numCount.get(keys[i]);
			if (cnt>=K) {
				System.out.println(keys[i]);
				break;
			}
		}
		sc.close();
	}

}
