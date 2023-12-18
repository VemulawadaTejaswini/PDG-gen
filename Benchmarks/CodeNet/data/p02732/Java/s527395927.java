import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		List<Long> integerList = getStrings(sc, num);
		HashMap<Long, CalResult> map = new HashMap<Long, CalResult>();

		long countSize = integerList.stream().distinct().count();
		long size = integerList.size();
		if (countSize == 1) {
			for (long i = 0; i < size; i++) {
				System.out.println((size - 1) * (size - 2) / 2);
			}
			return;
		} else if (countSize == size) {
			for (int i = 0; i < size; i++) {
				System.out.println(0);
			}
			return;
		}

		for (int i = 0; i < size; i++) {
			long a = integerList.get(i);
			if (!map.containsKey(a)) {
				CalResult c = new CalResult();
				c.setCount(1);
				map.put(a, c);
			} else {
				CalResult c = map.get(a);
				long b = c.getCount();
				c.setCount(b+1);
				map.put(a, c);
			}
		}

		long sumall = 0;
		for (Map.Entry<Long, CalResult> entry : map.entrySet()) {
			CalResult c = entry.getValue();
			long count = c.getCount();

			if (count>1) {
				sumall+=(count)*(count-1)/2;
				c.setWithCount((count)*(count-1)/2);
			} else {
				c.setWithCount(0);
			}
			if (count>2) {
				c.setWithoutCount((count-1)*(count-2)/2);
			} else {
				c.setWithoutCount(0);
			}
		}

		for (long i = 0; i < size; i++) {
			long sum =0;
			sum+=map.get(integerList.get((int) i)).getWithoutCount();
			sum+=sumall-map.get(integerList.get((int) i)).getWithCount();
			System.out.println(sum);
		}

	}

	static class CalResult {
		long count;
		long withCount;
		long withoutCount;

		public CalResult() {}

		public long getCount() {
			return count;
		}

		public void setCount(long count) {
			this.count = count;
		}

		public long getWithCount() {
			return withCount;
		}

		public void setWithCount(long withCount) {
			this.withCount = withCount;
		}

		public long getWithoutCount() {
			return withoutCount;
		}

		public void setWithoutCount(long withoutCount) {
			this.withoutCount = withoutCount;
		}
	}

	private static List<Long> getStrings(Scanner sc, long num) {
		List<Long> integerList = new ArrayList<>();
		while(num>0) {
			Long i = sc.nextLong();
			integerList.add(i);
			num--;
		}
		return integerList;
	}

}
