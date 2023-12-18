import java.util.*;

public class Main {

	static Map<Long, List<Long>> task = new TreeMap<Long, List<Long>>();
	public static void myadd(long key, long value) {
		List<Long> tmp = new ArrayList<Long>();
		if(task.containsKey(key)) {
			for(Long t : task.get(key)) {
				tmp.add(t);
			}
		}
		tmp.add(value);
		task.put(key, tmp);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int an = 0;
		for (int i = 0; i < n; ++i) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if (a > b)
				an = 1;
			myadd(b, a);
		}
		sc.close();
		String ans[] = { "Yes", "No" };
		if (an != 1) {
			long present = 0;
			Long b[] = task.keySet().toArray(new Long[0]);
			for(Long t : b) {
				List<Long> tmp = task.get(t);
				for(Long t2 : tmp) {
					present += t2.longValue();
				}
				if(present > t.longValue()) {
					an = 1;
					break;
				}
			}
		}
		System.out.println(ans[an]);
	}
}
