import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	
	public static void main(String[] args) {
		int n  = scan.nextInt();
		for(int i=0; i<n; i++) {
			String s = scan.next();
			char[] ca = s.toCharArray();
			
			Arrays.sort(ca);
			
			s = new String(ca);
			
			
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		
		long sum = 0;
		
		
		for(long k : map.values()) {
			k--;
			sum += (k*k+k)/2;
		}
		System.out.println(sum);
	}

}
