import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //回数
		
		Map<String,Integer>map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String s = stdIn.next();
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			}else {
				map.put(s,1);
			}
		}
		
		long cnt = 0;
		
		for(String a: map.keySet()) {
			cnt++;
		}
		System.out.println(cnt);
		
		
	}

}
