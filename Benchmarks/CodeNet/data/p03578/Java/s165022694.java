import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		Map<Integer,Integer>map = new TreeMap<>();
		for(int i = 0; i < n ; i++) {
			int d = stdIn.nextInt();
			if(map.containsKey(d)) {
				map.put(d,map.get(d)+1);
			}else {
				map.put(d,1);
			}
		}
		
		int m = stdIn.nextInt();
		
		int [] t = new int[m];
		
		for(int i = 0; i < m; i++) {
			t[i] = stdIn.nextInt();
		}
		
		Arrays.parallelSort(t);
		
		int mon = 0;
		
		for(int i = 0; i < m; i++) {
			if(map.containsKey(t[i]) && map.get(t[i])>= 1) {
				map.put(t[i],map.get(t[i])-1);
			}else {
				mon++;
			}	
			
			
		}
		
		if(mon >= m) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
