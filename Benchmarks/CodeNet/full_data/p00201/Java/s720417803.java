import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m;
	static Map<String, Integer> costMap;
	static Map<String, List<String>> itemMap;
	
	public static void main(String args[]){
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			costMap = new HashMap<String, Integer>();
			itemMap = new HashMap<String, List<String>>();
			
			for (int i = 0; i < n; i++) {
				String item = sc.next();
				int cost = sc.nextInt();
				costMap.put(item, cost);
			}
			m = sc.nextInt();
			for (int j = 0; j < m; j++) {
				String product = sc.next();
				int materialNum = sc.nextInt();
				List<String> al = new ArrayList<String>();
				for (int k = 0; k < materialNum; k++) {
					al.add(sc.next());
				}
				itemMap.put(product, al);
			}
			String target = sc.next();
			int answer = search(target);
			System.out.println(answer);	
		}
	}
	
	static int search(String target){
		if (itemMap.containsKey(target)) {
			int sum = 0;
			for(String item: itemMap.get(target)) {
				sum += search(item);
			}
			return Math.min(costMap.get(target), sum);
		} else {
			return costMap.get(target);
		}
	}
}
