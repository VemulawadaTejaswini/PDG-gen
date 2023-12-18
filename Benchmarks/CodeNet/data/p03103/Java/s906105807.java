import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	Map<Integer, Integer> shop = new HashMap<>();
    	for (int i = 0; i < N; i++) {
    		int cost = sc.nextInt();
    		int count = sc.nextInt();
    		if (shop.containsKey(cost)) {
    			shop.put(cost, shop.get(cost) + count);
    		} else {
    			shop.put(cost, count);
    		}
    	}
    	List<Integer> key = new ArrayList<>(shop.keySet());
    	Collections.sort(key);
    	int rem = M;
    	long totalCost = 0;
    	for (int i = 0; i < key.size(); i++) {
    		int cost = key.get(i);
    		int count = shop.get(cost);
    		if (count < rem) {
    			rem -= count;
    			totalCost += count * cost;
    		} else {
    			totalCost += rem * cost;
    			break;
    		}
    	}
    	System.out.println(totalCost);
    }
}