import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] a = line.split(" ");
        
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for (String v : a) {
        	if (countMap.containsKey(v)) {
        		countMap.put(v, countMap.get(v) + 1);
        	} else {
        		countMap.put(v, 1);
        	}
        }

        int typeCount = countMap.size();
        if (typeCount == 2) {
        	System.out.println(0);
        } else if (typeCount == 1) {
        	System.out.println(n / 2);
        } else {
        	int result = 0;
        	while (countMap.size() > 2) {
        		String minKey = findMin(countMap);
        		result += countMap.remove(minKey);
        	}
        	System.out.println(result);
        }
        
        sc.close();
	}
	
	private static String findMin(Map<String, Integer> countMap) {
		String minKey = null;
		int minValue = Integer.MAX_VALUE;
		for (String key : countMap.keySet()) {
			int value = countMap.get(key);
			if (value < minValue) {
				minValue = value;
				minKey = key;
			}
		}
		return minKey;
	}
}