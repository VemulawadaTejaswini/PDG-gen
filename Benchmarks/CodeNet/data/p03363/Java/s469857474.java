import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long[]a = new long[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextLong();
		}
		
		long[]s = new long[n+1];
		Arrays.fill(s, 0);
		
		for(int i = 1; i < n+1; i++) {
			s[i] = s[i-1] + a[i-1];
			
		}
		
		Map<Long,Integer> map = new HashMap<>();
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
		
		
		
		
		for(Long mapkey: map.keySet()) {
			if(map.get(s[mapkey])>1 && !bool[mapkey]) {
				cnt += map.get(s[mapkey])*(map.get(mapkey)-1)/2;
				bool[map.get(s[mapkey])] = true;
			}
		}
		
		
		System.out.println(cnt);
	}

}
