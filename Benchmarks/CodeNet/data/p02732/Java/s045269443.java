import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}

	
		
		
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {

				
				if(!map.containsKey(a[i])) {
					map.put(a[i],0);
				}
				map.put(a[i],map.get(a[i])+1);
		}
			
		
		
		for(int i = 0; i < n; i++) {
			long cnt = 0;
			map.put(a[i],map.get(a[i])-1);
			
			for(Integer k: map.keySet()) {
				cnt += (map.get(k)*(map.get(k)-1))/2;
			}
			System.out.println(cnt);
			
			map.put(a[i],map.get(a[i])+1);			
		}
		



	}

}
