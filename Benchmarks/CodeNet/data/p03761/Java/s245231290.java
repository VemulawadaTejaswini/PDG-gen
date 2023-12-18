import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Map<Character, Integer> ansMap = new HashMap<>(30,1);
		for (int i = 'a'; i <= 'z'; i++) {
			ansMap.put((char)i, Integer.MAX_VALUE);
		}
		
		
		for (int i = 0; i < N; i++) {
			Map<Character, Integer> map = new HashMap<>(30,1);
			String s = sc.next();
			for (char c: s.toCharArray()) {
				if (!map.containsKey(c)) {
					map.put(c, 1);
				} else {
					map.put(c, map.get(c) + 1);
				}
			}
			
			for (int j = 'a'; j <= 'z'; j++) {
				Integer count = map.get((char)j);
				int intCount = 0;
				if (count != null && count != Integer.MAX_VALUE) {
					intCount = count;
				}
				int min = ansMap.get((char)j);
				min = Math.min(min, intCount);
				ansMap.put((char)j, min);
			}
		}
		
		String ans = "";
		
		for (int i = 'a'; i <= 'z'; i++) {
			int count = ansMap.get((char)i);
			for (int j = 0; j < count; j++) {
				ans += (char)i;
			}
		}
		
		System.out.println(ans);
		
	}
}
