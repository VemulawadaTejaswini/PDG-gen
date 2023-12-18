import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		int n = sc.nextInt();
    		ArrayList<HashMap<Character, Integer>> histgrams = new ArrayList<>();

    		for (int i=0; i<n; i++) {
    			String s = sc.next();
    			HashMap<Character, Integer> map = new HashMap<>();
    			for (int j=0; j<s.length(); j++) {
    				Character c = s.charAt(j);
    				if (map.containsKey(c)) {
    					int count = map.get(c);
    					count++;
    					map.put(c,  count);
    				} else {
    					map.put(c, 1);
    				}
    			}
    			histgrams.add(map);
    		}

    		long sum = 0;
    		while (!histgrams.isEmpty()) {
    			Iterator<HashMap<Character, Integer>> it = histgrams.iterator();
    			HashMap<Character, Integer> map1 = it.next();
    			it.remove();
    			long count = 1;

    			while(it.hasNext()) {
        			HashMap<Character, Integer> map2 = it.next();
    				if (map1.equals(map2)) {
    					count++;
    					it.remove();
    				}
    			}

    			if (count >= 2) {
    				if (count % 2 == 0) {
        				sum += (count / 2) * (count - 1);
    				} else {
    					sum += count * ((count - 1) / 2);
    				}
    			}
    		}

    		System.out.println(sum);
    	} finally {
    		sc.close();
    	}
    }
}



