import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int n = in.nextInt();
			int count = 0;
			if (map.containsKey(n)) {
				count = map.get(n);
			}
			map.put(n, count + 1);
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int n : map.keySet()) {
			arr.add(map.get(n));
		}
		arr.sort(null);
		
		int answer = 0;
		for (int i = 0; i < arr.size() - K; i++) {
			answer += arr.get(i);
		}
		System.out.println(answer);
	}
}