import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();

		char[] array = x.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for(char c : array) {
			int v;
			if(map.containsKey(c)) {
				v = map.get(c) + 1;
			} else {
				v = 1;
			}
			map.put(c, v);
		}

		boolean flag = false;
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    if(entry.getValue() >= 3) {
		    	flag = true;
		    	break;
		    }
		}

		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}