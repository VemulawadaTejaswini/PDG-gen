import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			Map<Integer, Integer> conditions = new HashMap<>();
			
			boolean ok = true;
			for(int i = 0 ; i < m ; i++ ) {
				int s = sc.nextInt();
				int c = sc.nextInt();
				if ( conditions.containsKey(s)) {
					int v = conditions.get(s);
					
					if ( c != v ) {
						ok = false;
						break;
					}
				}
				else {
					conditions.put(s, c);
				}
			}
			
			if ( ok && conditions.containsKey(1) && conditions.get(1) > 0 ) {
				//ok case
				for(int i = 0 ; i < n ; i++ ) {
					int c = conditions.containsKey(i+1) ? conditions.get(i+1) : 0;
					System.out.print(c);
				}
			}
			else {
				System.out.println("-1");
			}
			
		}
	}
}