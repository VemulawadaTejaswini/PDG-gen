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
		long[] ret = new long[Q];
		for(int i = 0; i < Q; i++) {
			int before = Integer.valueOf(s.next());
			int after = Integer.valueOf(s.next());
			
			map.put(after, map.getOrDefault(after, 0) + map.getOrDefault(before, 0));
			map.remove(before);
			ret[i] = getV(map);
		}
		
		for(int i = 0; i < Q; i++) {
			System.out.println(ret[i]);
		}
		
		
		
	}
	private static long getV(Map<Integer, Integer> map) {
		long ret = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ret += entry.getKey() * entry.getValue();
		}
		return ret;
	}
}