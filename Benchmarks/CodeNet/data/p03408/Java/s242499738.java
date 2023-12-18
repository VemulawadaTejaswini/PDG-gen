import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		HashMap<String,Integer> map_1 = new HashMap<String, Integer>();
		for (int i=0;i<N;i++) {
			String tmp = sc.next();
			int sum = 1;
			if (map_1.containsKey(tmp)) {
				sum += map_1.get(tmp);
			}
			map_1.put(tmp,sum);
		}
		int M = Integer.parseInt(sc.next());
		for (int i=0;i<M;i++) {
			String tmp = sc.next();
			int sum = -1;
			if (map_1.containsKey(tmp)) {
				sum += map_1.get(tmp);
			}
			map_1.put(tmp,sum);
		}
		int max=0;
		for (int i: map_1.values()) {
			max=Math.max(max,i);
		}
		System.out.println(max);
	}
}