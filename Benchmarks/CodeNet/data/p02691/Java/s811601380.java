import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long[] A = new long[N];
		Map<Long, Set<Integer>> map1 = new HashMap<>();
		Map<Long, Set<Integer>> map2 = new HashMap<>();
		for(int i = 0; i < N; i++) {
			A[i] = s.nextLong();
			if(i > A[i])
				map1.computeIfAbsent(i - A[i], set -> new HashSet<>()).add(i);
			map2.computeIfAbsent(i + A[i], set -> new HashSet<>()).add(i);
			
		}
		
		long result = 0;
		for(Map.Entry<Long, Set<Integer>> entry : map1.entrySet()) {
			if(entry.getValue().size() < 1)
				continue;
			result += entry.getValue().size() * map2.getOrDefault(entry.getKey(), Collections.emptySet()).size();
		}
		
		System.out.println(result);
    }
}
