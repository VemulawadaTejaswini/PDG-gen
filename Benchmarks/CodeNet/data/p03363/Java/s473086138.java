import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[]a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		int []s = new int[n+1];
		Arrays.fill(s, 0);
		
		for(int i = 1; i < n+1; i++) {
			s[i] = s[i-1] + a[i-1];
			
		}
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < n+1; i++) {
			if(!map.containsKey(s[i])) {
				map.put(s[i], 1);
			}else {
				map.put(s[i],map.get(s[i])+1);
			}
		}
		
		
		int cnt = 0;
		boolean [] bool = new boolean[n];
		Arrays.fill(bool, false);
		
		
		
		
		for(int mapkey: map.keySet()) {
			if(map.get(mapkey)>1 && !bool[mapkey]) {
				cnt += map.get(mapkey)*(map.get(mapkey)-1)/2;
				bool[mapkey] = true;
			}
		}
		
		
		System.out.println(cnt);
	}

}
