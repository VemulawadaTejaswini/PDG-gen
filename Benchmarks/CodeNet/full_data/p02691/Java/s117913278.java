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
		long sum = 0;
		Map<Long, Long> arraymin = new HashMap<>();
		for (int i = 0; i < n; i++) {
			long r = array.get(i) + i;
			if (arraymin.containsKey(r)) {
				arraymin.put(r, arraymin.get(r)+1);
			} else {
				arraymin.put(array.get(i) + i, 1l);
			}
		}

		for (int i = 0; i < n; i++) {
			long r = i - array.get(i);
			if (arraymin.containsKey(r)) {
				sum+=arraymin.get(r);
			}
		}
		System.out.println(sum);
	}

}
