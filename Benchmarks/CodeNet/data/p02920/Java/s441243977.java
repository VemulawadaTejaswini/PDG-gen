import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	void run() {
		int n = sc.nextInt();

		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (long i = 0; i < 1L<<n; i++) {
			int key = sc.nextInt();
			int value = map.getOrDefault(key, 0) + 1;
			map.put(key,value);
		}
		
		int[] num = new int[n+1];
		num[0] = 1;
		for(int i = 0; i < n ;i++) {
			num[i+1] = 1<<i;
		}
		
		int cur = 0;
		boolean flag = true;
		for(int i: map.values()) {
//			System.out.println(cur+" "+i);
			int prev = cur;
			cur += i;
			if(cur >= num[n] ) {
				cur -= num[n];
				n--;
				if(cur > prev) {
					flag=false;
					break;
				}
			}
			
		}
		System.out.println(flag?"Yes":"No");
	}
	
}