import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String,Integer> map = new HashMap<>();
		for(; N > 0; N--) {
			String a = sc.next();
			if(map.containsKey(a)) {
				map.put(a, (map.get(a)+1));
			}else {
				map.put(a, 1);
			}
		}

		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2){
				return obj2.getValue().compareTo(obj1.getValue());
            }
        });

		ArrayList<String> list = new ArrayList<>();
		int ch = 0;
		for(Entry<String, Integer> entry : list_entries) {
			String key = entry.getKey();
			if((entry.getValue() != ch)&&(ch != 0)) {
				break;
			}else {
				list.add(key);
				ch = entry.getValue();
			}
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}