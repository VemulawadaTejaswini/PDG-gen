import java.util.ArrayList;
import java.util.Collections;
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
				smap.put(String.valueOf(s.charAt(i)), (smap.get(String.valueOf(s.charAt(i)))+1));
			} else {
				smap.put(String.valueOf(s.charAt(i)), 1);
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if (tmap.containsKey(String.valueOf(t.charAt(i)))) {
				tmap.put(String.valueOf(t.charAt(i)), (tmap.get(String.valueOf(t.charAt(i)))+1));
			} else {
				tmap.put(String.valueOf(t.charAt(i)), 1);
			}
		}
		if (smap.size() != tmap.size()) {
			System.out.println("No");
			return;
		}
		List<String> slist = new ArrayList<>(smap.keySet());
		List<String> tlist = new ArrayList<>(tmap.keySet());
		List<Integer> stemp = new ArrayList<>();
		List<Integer> ttemp = new ArrayList<>();
		for (int i = 0; i < slist.size(); i++) {
//			if (tmap.containsKey(slist.get(i)) && tmap.get(slist.get(i)) != smap.get(slist.get(i))) {
//				System.out.println("No");
//				return;
//			}
			if (!tmap.containsKey(slist.get(i))) {
				stemp.add(smap.get(slist.get(i)));
			}
		}
		for (int i = 0; i < tlist.size(); i++) {
			if (!smap.containsKey(tlist.get(i))) {
				ttemp.add(tmap.get(tlist.get(i)));
			}
		}
		System.out.println(stemp);
		System.out.println(ttemp);
		Collections.sort(stemp);
		Collections.sort(ttemp);
		System.out.println(stemp);
		System.out.println(ttemp);
		if (!stemp.equals(ttemp)) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
