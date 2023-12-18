import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}

	
		
		
		
		
		for(int i = 0; i < n; i++) {
			Map<Integer,Integer> map = new HashMap<>();
			long cnt = 0;
			
			for(int j = 0; j < n; j++) {
				if(j == i) {
					continue;
				}
				
				if(!map.containsKey(a[j])) {
					map.put(a[j],0);
				}
				map.put(a[j],map.get(a[j])+1);
			}
			
			for(Integer k: map.keySet()) {
				cnt += (map.get(k)*(map.get(k)-1))/2;
			}
			System.out.println(cnt);
		}


	}

}
