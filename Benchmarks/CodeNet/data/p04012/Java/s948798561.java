import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		sc.close();
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0;i < w.length();++i) {
			if(map.containsKey(w.charAt(i))) {
				Integer cap = map.get(w.charAt(i));
				map.remove(w.charAt(i));
				map.put(w.charAt(i), cap+1);
			} else {
				map.put(w.charAt(i), 1);
			}
		}
		int min = Integer.MAX_VALUE;
		for(Character c : map.keySet())
			if(map.get(c) < min)
				min = map.get(c);
		if(min < 2)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
