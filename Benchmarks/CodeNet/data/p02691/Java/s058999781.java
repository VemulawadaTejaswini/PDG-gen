import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer,Integer> low = new HashMap<>();
		Map<Integer,Integer> high = new HashMap<>();
		for(int i = 1; i <= n; i++) {
			int val = sc.nextInt();
			low.put(i - val, low.getOrDefault(i - val , 0) + 1);
			high.put(val + i, high.getOrDefault(val + i, 0) + 1);
		}
		int res = 0;
		for(int key : low.keySet()) {
			if(high.containsKey(key)) {
				res += low.get(key) * high.get(key);
			}
		}
		System.out.println(res);
    }
  
}