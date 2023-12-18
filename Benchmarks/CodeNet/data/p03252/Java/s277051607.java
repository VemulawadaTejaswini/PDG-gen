import java.util.HashMap;
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
		} else {
			System.out.println("Yes");
		}
	}	
}