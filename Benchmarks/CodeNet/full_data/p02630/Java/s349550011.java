import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			
			HashMap<Integer, Integer> map = new HashMap<>();
			int sum = 0;
			for(int i = 0 ; i < n ; i++ ) {
				int a = sc.nextInt();
				
				int count = 0;
				if ( map.containsKey(a)) {
					count = map.get(a);
				}
				count++;
				
				map.put(a, count);
				
				sum += a;
			}
			
			int q = sc.nextInt();
			
			for(int i = 0 ; i < q ; i++ ) {
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				if ( map.containsKey(b)) {
					
					int count = map.get(b);
					int diff = c - b;
					
					sum += diff * count;
					
					int cCount = 0;
					if ( map.containsKey(c)) {
						cCount = map.get(c);
					}
					cCount += count;
					map.put(c, cCount);
					map.remove(b);
					
				}

				System.out.println(sum);

			}
			
				
		}
	}

}