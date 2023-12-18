import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import static java.util.stream.Collectors.*;
import static java.util.function.Function.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] ary = new Integer[n];
		for(int i=0; i<n; i++){
			ary[i] = in.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(ary);
		Map<Integer, Long> map = list
		.stream()
		.collect(groupingBy(identity(), counting()));
        // for (Map.Entry<Integer, Long> tmp : map.entrySet()) {
		// 	if (tmp.getValue() == 1) {
		// 		map.remove(tmp.getKey());
		// 	}
		// }
		Iterator<Map.Entry<Integer, Long>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
    		Map.Entry<Integer, Long> e = iterator.next();
    		if (e.getValue() == 1) {
				iterator.remove();
			}
		}
		for(int i=0; i<n; i++){
			if(map.containsKey(ary[i])){
				map.put(ary[i],map.get(ary[i]) - 1);
			}
			long totalCount = 0;
			for (Long value : map.values()) {
				totalCount += combination(value, 2);
			}
			System.out.println(totalCount);
			if(map.containsKey(ary[i])){
				map.put(ary[i],map.get(ary[i]) + 1);
			}
		}
	}
	public static long factorial(long n) {
		if (n <= 1)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	}
	public static long combination(long n, long r) {
		long top = n;
		for (int i = 0; i < r - 1; i++) {
			top = top * (--n);
		}
		long bottom = factorial(r);
		return top / bottom;
	}
}
