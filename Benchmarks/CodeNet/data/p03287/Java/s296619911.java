import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextInt();

		List<Long> snackNumList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			snackNumList.add(sc.nextLong());
		}

		Map<Long, Long> snackMap = new HashMap<>();
		snackMap.put(0L, 1L);
		long remain = 0;
		long counter = 0;

		for (int i = 0; i < snackNumList.size(); i++) {
			remain = (remain + snackNumList.get(i)) % M;
			counter += snackMap.getOrDefault(remain, 0L);
			snackMap.put(remain, snackMap.getOrDefault(remain, 0L) + 1L);
		}

		System.out.println(counter);
		sc.close();
	}
}
