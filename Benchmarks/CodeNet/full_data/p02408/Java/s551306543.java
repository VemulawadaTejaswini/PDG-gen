import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	private static Map<String, Integer> map = new HashMap<>();
	
	static {
		map.put("S", 0);
		map.put("H", 1);
		map.put("C", 2);
		map.put("D", 3);
	}

	public static void main(String[] args) {
		
		boolean given[][] = new boolean[4][13];
		
		try (Scanner sc = new Scanner(System.in);) {
			
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				String suit = sc.next();
				int rank = sc.nextInt();
				
				given[getIntSuit(suit)][rank - 1] = true;
			}
			
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 13; j++) {
					if(!given[i][j]) {
						System.out.println(getStringSuit(i) + " " + (j + 1));
					}
				}
			}
		}
	}
	
	private static int getIntSuit(String str) {
		return map.get(str);
	}
	
	private static String getStringSuit(int i) {
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		
		for(Map.Entry<String, Integer> e : entry) {
			if(e.getValue().equals(i)) {
				return e.getKey();
			}
		}
		
		return ""; //unused
	}
}

