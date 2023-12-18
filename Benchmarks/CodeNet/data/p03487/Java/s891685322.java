import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		HashMap<Integer, Integer> aCount = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			int cnt = aCount.getOrDefault(ai, 0) + 1;
			aCount.put(ai, cnt);
		}

		int count = 0;

		for (Integer key : aCount.keySet()) {
			int val = aCount.get(key);
			if (key < val) {
				count += val - key;
			}else if(key > val) {
				count += val;
			}
		}
		System.out.println(count);
		sc.close();
	}

}