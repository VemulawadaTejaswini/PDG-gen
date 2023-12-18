import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for(int i=0; i<N;i++) {
			String s = sc.next();
			if(map.get(s)==null) {
				map.put(s, 1);
			}else {
				map.put(s, map.get(s)+1);
			}
		}
		Map<String, Integer> map_sorted = MapValueSort(map, 1);
		int i=0;
		int cnt=0;
		for (Map.Entry<String,Integer> entry : map_sorted.entrySet()) {
			i++;
			if(i==1) {
				cnt = entry.getValue();
			}
			if(entry.getValue()!=cnt) {
				break;
			}
			System.out.println(entry.getKey());
		}
		
	}
	
	static Map<String,Integer> MapValueSort (Map<String,Integer> map, int n) {
		List<Integer> list = new ArrayList<>(map.values());
		List<String> list2 = new ArrayList<>();
		Map<String,Integer> map2 = new LinkedHashMap<>();
		if (n==0) {Collections.sort(list);}
		else if (n==1) {Collections.sort(list,Comparator.reverseOrder());}
		for (int i=0; i<list.size(); i++) {
			for (Map.Entry<String,Integer> entry : map.entrySet()) {
				if (list.get(i)==entry.getValue() && list2.contains(entry.getKey())==false) {
					map2.put(entry.getKey(),entry.getValue());
					list2.add(entry.getKey());
					break;
				}
			}
		}
		return map2;
	}


}