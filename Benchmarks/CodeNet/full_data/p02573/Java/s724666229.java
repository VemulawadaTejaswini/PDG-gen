import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int n;
	int m;

	public void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

	    Map<Integer,Set<Integer>> map = new HashMap<>();
	    int max=1;
		for( int i=0; i< m ; i++ ) {
			Function<? super Integer, ? extends Set<Integer>> createSetIfNull = (v)->{ 
				Set<Integer> s = new HashSet<>();
				s.add(v);
				return s;
			};
			int a = sc.nextInt();
			Set<Integer> r = map.computeIfAbsent(a, createSetIfNull);
			int b = sc.nextInt();
			Set<Integer> l = map.computeIfAbsent(b, createSetIfNull);
			
			r.addAll(l);
			map.put(a, r);
			map.put(b, r);
			
			if( max < r.size() ) {
				max = r.size();
			}
		}
		
		System.out.println(max);
		
		
		
	}
}