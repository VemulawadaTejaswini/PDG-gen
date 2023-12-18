import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		Map<String, Integer> m = new HashMap<>();
		int max = 0;
		for (int i = 0; i < n; i++) {
			String s = scan.nextLine();
			if (m.containsKey(s)) {
				m.put(s, (m.get(s)) +1); 
				if (m.get(s) > 0) {
					max = m.get(s);
				}
			} else {
				m.put(s, 0); 
			}
		}
		ArrayList<String> results = new ArrayList<String>();
		for (Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() == max) {
            	results.add(entry.getKey());
            }
        }
		
		Collections.sort(results);
		for (int i = 0; i < results.size(); i++) {
			System.out.println(results.get(i));
		}
//		for (int i = 0; i < m.size(); i++) {
//			
//		}
		
		
		//D PAIRS
		
//		Scanner scan = new Scanner(System.in);
//		ArrayList<Long> repeated = new ArrayList<Long>();
//		
//		int n = scan.nextInt();
//		int k = scan.nextInt();
//		
//		long[] nums = new long[n];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = scan.nextInt();
//		}
//		
//		for (int i = 0; i < n-1; i++) {
//			for (int j = i+1; j < n; j++) {
//				repeated.add(nums[i] * nums[j]);
//			}
//		}
//		Collections.sort(repeated);
//		System.out.println(repeated.get(k-1));
	}
	
}