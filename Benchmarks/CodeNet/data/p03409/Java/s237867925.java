import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
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
		List<Entry<Integer, Integer>> list = new ArrayList<>();
		for(int i = 0; i < n; i++) list.add(new SimpleEntry<Integer,Integer>(sc.nextInt(), sc.nextInt()));
		Map<Entry<Integer, Integer>, List<Entry<Integer, Integer>>> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			Entry<Integer, Integer> entry = new SimpleEntry<>(sc.nextInt(), sc.nextInt());
			map.put(entry, list.stream().filter(e -> entry.getKey() > e.getKey() && entry.getValue() > e.getValue()).collect(Collectors.toList()));
		}
		List<Entry<Integer, Entry<Entry<Integer, Integer>, List<Entry<Integer, Integer>>>>> l = map.entrySet().stream()
				.map(entry -> new SimpleEntry<Integer, Entry<Entry<Integer, Integer>, List<Entry<Integer, Integer>>>>(entry.getValue().size(), entry))
				.sorted((e1, e2) -> e1.getKey() - e2.getKey()).collect(Collectors.toList());

		Map<Entry<Integer, Integer>, List<Entry<Integer, Integer>>> m = new HashMap<>();
		for(Entry<Integer, Integer> entry : list){
			m.put(entry, map.keySet().stream().filter(e -> entry.getKey() < e.getKey() && entry.getValue() < e.getValue()).collect(Collectors.toList()));
		}
		for(Entry<Integer, Entry<Entry<Integer, Integer>, List<Entry<Integer, Integer>>>> entry : l){
			List<Entry<Integer, Integer>> friendList = entry.getValue().getValue();
			friendList.sort((e1, e2)-> m.get(e1).size() - m.get(e2).size());
		}
		Set<Entry<Integer, Integer>> usedEntry = new HashSet<>();
		int count = 0;
		for(Entry<Integer, Entry<Entry<Integer, Integer> , List<Entry<Integer, Integer>>>> entry : l){
			List<Entry<Integer, Integer>> friends = entry.getValue().getValue();
			friends.removeAll(usedEntry);
			if(friends.isEmpty()) continue;
			usedEntry.add(friends.get(0));
			count++;
		}
		System.out.println(count);
	}
}