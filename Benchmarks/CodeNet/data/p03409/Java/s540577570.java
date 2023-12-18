import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> red = new HashMap<>();
		Map<Integer, Integer> blue = new HashMap<>();
		for(int i = 0; i < n;i++) red.put(sc.nextInt(), sc.nextInt());
		int rXmin = red.keySet().stream().min((i1, i2)-> i1-i2).get();
		int rYmin = red.values().stream().min((i1, i2) -> i1-i2).get();
		for(int i = 0; i < n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x <= rXmin || y <= rYmin) continue;
			blue.put(x, y);
		}

		if(blue.isEmpty()){
			System.out.println(0);
			return;
		}

		int bXMax = blue.keySet().stream().max((i1, i2)->i1-i2).get();
		int bYMax = blue.values().stream().max((i1, i2)->i1-i2).get();
		red = red.entrySet().stream().filter(e -> e.getKey() < bXMax && e.getValue() < bYMax).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
//		System.out.println(red);
//		System.out.println(blue);

		if(red.isEmpty()){
			System.out.println(0);
			return;
		}

		List<Entry<Entry<Integer, Integer>, List<Entry<Integer, Integer>>>> list = new ArrayList<>();
		for(Entry<Integer, Integer> entry : red.entrySet()){
			list.add(new SimpleEntry<>(entry, blue.entrySet().stream().filter(e -> e.getKey() > entry.getKey() && e.getValue() > entry.getValue()).collect(Collectors.toList())));
		}
		for(Entry<Integer, Integer> entry : blue.entrySet()){
			list.add(new SimpleEntry<>(entry, red.entrySet().stream().filter(e -> e.getKey() < entry.getKey() && e.getValue() < entry.getValue()).collect(Collectors.toList())));
		}
		Collections.sort(list, (e1, e2) -> e1.getValue().size() - e2.getValue().size());
//		System.out.println(list);
		Set<Entry<Integer, Integer>> usedSet = new HashSet<>();
		int count = 0;
		for(Entry<Entry<Integer, Integer>, List<Entry<Integer, Integer>>> entry : list){
			if(usedSet.contains(entry.getKey())) continue;
			List<Entry<Integer, Integer>> l = entry.getValue().stream().filter(e -> !usedSet.contains(e)).collect(Collectors.toList());
			if(l.isEmpty()) continue;
			usedSet.add(entry.getKey());
			usedSet.add(l.get(0));
			count++;
		}
		System.out.println(count);
	}
}