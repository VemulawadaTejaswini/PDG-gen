import java.util.*;

public class Main {

	private static List<Long> getStrings(Scanner sc, int num) {
		List<Long> stringList = new ArrayList<>();
		while(num>0) {
			long nextInt = sc.nextLong();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> array = getStrings(sc, n);
		int q = sc.nextInt();
		long sum = 0;
		Map<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < array.size(); i++) {
			long key = array.get(i);
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				int times = map.get(key);
				map.put(key, times+1);
			}
			sum+=key;
		}
		while(q > 0) {
			long b = sc.nextLong();
			long c = sc.nextLong();
			if (map.containsKey(b)) {
				int t = map.get(b);
				sum = sum + t*(c-b);
				map.remove(b);
				if (map.containsKey(c)) {
					map.put(c, t+map.get(c));
				} else {
					map.put(c, t);
				}
			}
			System.out.println(sum);
			q--;
		}
	}

}
