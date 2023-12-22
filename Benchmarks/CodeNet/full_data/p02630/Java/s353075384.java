import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			int A = Integer.valueOf(s.next());
			map.put(A, map.getOrDefault(A, 0) + 1);
		}
		int Q = Integer.valueOf(s.next());
		long[] ret = new long[Q+1];
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ret[0] += entry.getKey() * entry.getValue();
		}
		
		for(int i = 0; i < Q; i++) {
			int before = Integer.valueOf(s.next());
			int after = Integer.valueOf(s.next());
			
			ret[i+1] = ret[i] + (after - before) * map.getOrDefault(before, 0);
			map.put(after, map.getOrDefault(after, 0) + map.getOrDefault(before, 0));
			map.remove(before);
		}
		
		for(int i = 1; i <= Q; i++) {
			System.out.println(ret[i]);
		}
	}
}