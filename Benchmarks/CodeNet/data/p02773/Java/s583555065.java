import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<String> stringList = new ArrayList<>();
		while(num>0) {
			String nextString = sc.next();
			stringList.add(nextString);
			num--;
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int maxValue =0;
		for(String s: stringList) {
			if (map.containsKey(s)) {
			    map.put(s, map.get(s)+1);
			} else {
				map.put(s, 1);
			}
			if (maxValue < map.get(s)) {
		    	maxValue = map.get(s);
		    }
		}
		final int maxValueFinal = maxValue;
		LinkedHashMap<String, Integer> sortedMap = sortHashMapByValues(map);
		sortedMap.entrySet().stream()
			.filter(n -> n.getValue() == maxValueFinal)
			.forEach(n -> System.out.println(n.getKey()));
	}
	
	
	public static LinkedHashMap<String, Integer> sortHashMapByValues(
	        HashMap<String, Integer> passedMap) {
	    List<String> mapKeys = new ArrayList<>(passedMap.keySet());
	    List<Integer> mapValues = new ArrayList<>(passedMap.values());
	    Collections.sort(mapValues);
	    Collections.sort(mapKeys);

	    LinkedHashMap<String, Integer> sortedMap =
	        new LinkedHashMap<>();

	    Iterator<Integer> valueIt = mapValues.iterator();
	    while (valueIt.hasNext()) {
	        Integer val = valueIt.next();
	        Iterator<String> keyIt = mapKeys.iterator();

	        while (keyIt.hasNext()) {
	            String key = keyIt.next();
	            Integer comp1 = passedMap.get(key);
	            Integer comp2 = val;

	            if (comp1.equals(comp2)) {
	                keyIt.remove();
	                sortedMap.put(key, val);
	                break;
	            }
	        }
	    }
	    return sortedMap;
	}
}
