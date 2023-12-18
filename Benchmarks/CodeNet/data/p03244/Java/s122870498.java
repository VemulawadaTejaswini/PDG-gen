import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> Gmap = new HashMap<>();
		Map<Integer, Integer> Kmap = new HashMap<>();
		Set<Integer>set=new HashSet<>();
		for (int i = 0; i < n; i++) {
			int key = scanner.nextInt();
			if (i % 2 == 0) {
				if (Gmap.containsKey(key)) {
					Gmap.put(key, Gmap.get(key) + 1);
				} else {
					Gmap.put(key, 1);
				}
			} else {
				if (Kmap.containsKey(key)) {
					Kmap.put(key, Kmap.get(key) + 1);
				} else {
					Kmap.put(key, 1);
				}
			}
			set.add(key);
		}
		
		if(set.size()==1) {
			System.out.println(n/2);
			return;
		}

		List<Entry<Integer, Integer>> GList = new ArrayList<Entry<Integer, Integer>>(Gmap.entrySet());
        Collections.sort(GList, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        List<Entry<Integer, Integer>> KList = new ArrayList<Entry<Integer, Integer>>(Kmap.entrySet());
        Collections.sort(KList, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        
        int ans=0;
        if(GList.get(0).getKey()!=KList.get(0).getKey()&&Gmap.size()!=1&&Kmap.size()!=1) {
        	ans=n-GList.get(0).getValue()-KList.get(0).getValue();
        }
        else if(GList.get(0).getKey()!=KList.get(0).getKey()&&Gmap.size()!=1) {
        	ans=n/2-GList.get(0).getValue();
        }
        else if(GList.get(0).getKey()!=KList.get(0).getKey()&&Kmap.size()!=1) {
        	ans=n/2-KList.get(0).getValue();
        }
        else if(GList.get(0).getKey()==KList.get(0).getKey()&&Gmap.size()!=1&&Kmap.size()!=1) {
        	ans=n-Math.max(GList.get(0).getValue()+KList.get(1).getValue(), GList.get(1).getValue()+KList.get(0).getValue());
        }
        else if(GList.get(0).getKey()==KList.get(0).getKey()&&Gmap.size()!=1) {
        	ans=n/2-GList.get(1).getValue();
        }
        else if(GList.get(0).getKey()==KList.get(0).getKey()&&Kmap.size()!=1) {
        	ans=n/2-KList.get(1).getValue();
        }
        
        System.out.println(ans);
        
	}
}
