import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int m = stdIn.nextInt();
		
		int[] s = new int[m];
		int[] c = new int[m];
		
		/*for(int i = 0; i < m; i++) {
			s[i] = stdIn.nextInt();
			c[i] = stdIn.nextInt();
		}
		*/
		
		Map <Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < m; i++) {
			int b = stdIn.nextInt();
			int e = stdIn.nextInt();
			if(!map.containsKey(b)) {
				map.put(b,e);
			}
			
			if(map.get(b) != e || b == 1 && e == 0) {
				System.out.println("-1");
				System.exit(0);
			}
			
		}
		
		int index = 1;
		for(Integer key: map.keySet()) {
			if(key ==index) {
				System.out.print(map.get(index));
				index++;
			}else {
				System.out.print("0");
				index++;
				System.out.print(map.get(index));
			}
			
			
			
		}
		
		/*	for(int i = 0; i < 3; i++) {
				if(map. == i+1) {
					System.out.print(map.get(index));
					index++;
				}else {
					System.out.print("0");
					index++;
				}
			}
			*/
		
	}

}
