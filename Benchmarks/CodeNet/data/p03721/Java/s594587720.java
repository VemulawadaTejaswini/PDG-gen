import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		long k = stdIn.nextLong();
		
		Map<Integer,Integer> map = new TreeMap<>();
		
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			if(!map.containsKey(a)) {
				map.put(a,b);
			}else {
				map.put(a,map.get(a)+b);
			}
		}
		
		long sum = 0;
		for(Integer key: map.keySet()) {
			if(sum + map.get(key) < k) {
				sum += map.get(key);
			}else {
				System.out.println(key);
				return;
			}
			
			
			
		}
		
		
		
	}

}
