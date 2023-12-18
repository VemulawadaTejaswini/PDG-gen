import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		Map<String, Integer> smap = new HashMap<>();
		Map<String, Integer> tmap = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (smap.containsKey(String.valueOf(s.charAt(i)))) {
				smap.put(String.valueOf(s.charAt(i)), smap.get(String.valueOf(s.charAt(i))+1));
			} else {
				smap.put(String.valueOf(s.charAt(i)), 1);
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if (tmap.containsKey(String.valueOf(t.charAt(i)))) {
				tmap.put(String.valueOf(t.charAt(i)), tmap.get(String.valueOf(t.charAt(i))+1));
			} else {
				tmap.put(String.valueOf(t.charAt(i)), 1);
			}
		}
		if (smap.size() != tmap.size()) {
			System.out.println("No");
			return;
		}
		List<String> list = new ArrayList<>(smap.keySet());
		for (int i = 0; i < list.size(); i++) {
			if (tmap.containsKey(list.get(i)) && tmap.get(list.get(i)) != smap.get(list.get(i))) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}	
}