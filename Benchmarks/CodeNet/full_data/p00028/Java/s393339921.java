import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main{
	
	public static void main(String... args) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int in = sc.nextInt(); if(in == 0) break;
			if(m.containsKey(in)) {
				m.put(in, m.get(in) + 1);
			}else m.put(in, 1);
		}
		sc.close();
		
		List<Integer> modes = findMode(m);
		Collections.sort(modes, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2){
				if(o1 < o2) return -1;
				else if(o1 == o2) return 0;
				else return 1;
			}});
		
		for(int i: modes) System.out.println(i);
	}
	
	static <K> List<K> findMode(Map<K, Integer> map){
		List<K> result = new ArrayList<K>();
		int max_value = 0;
		for(Map.Entry<K, Integer> e: map.entrySet()) {
			if(e.getValue() > max_value) {
				result = new ArrayList<K>();
				result.add(e.getKey());
				max_value = e.getValue();
			}else if(e.getValue() == max_value) {
				result.add(e.getKey());
			}
		}
		return result;
	}
}