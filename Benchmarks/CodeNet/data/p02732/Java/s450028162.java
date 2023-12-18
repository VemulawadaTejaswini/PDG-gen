import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[] aArray = new int[n];
			Map<Integer, Integer> countMap = new HashMap<>();
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
				if ( countMap.containsKey(aArray[i])) {
					countMap.put(aArray[i], countMap.get(aArray[i]) + 1);
				}
				else {
					countMap.put(aArray[i], 1);
				}
			}
			
			for(int i = 0 ; i < n ; i++ ) {
				int current = aArray[i];
				
				int ans = 0;
				for(int key : countMap.keySet()) {
					int count = countMap.get(key);
					if ( key == current) {
						count--;
					}
					ans += count * (count -1) / 2;
				}
				
				System.out.println(ans);
			}
			
			
		}
	}

}