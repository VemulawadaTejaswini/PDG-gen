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
		
		int cnt = 0;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i], 0);
			}
			
			map.put(a[i], map.get(a[i])+1);
			
			
		}
		
		for(int s: map.keySet()) {
			if(map.get(s)%2!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}

}
