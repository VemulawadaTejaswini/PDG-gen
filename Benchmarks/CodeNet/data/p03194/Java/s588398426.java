import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long P = sc.nextLong();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		boolean flag = true;
		out : while(flag) {
			for(int i = 2; i <= P; i++) {
				if(P % i == 0) {
					if(map.containsKey(i)) {
						P /= i;
						map.put(i, map.get(i) + 1);
						continue out;
					} else {
						P /= i;
						map.put(i, 1);
						continue out;
					}
				}
			}
			flag = false;
		}
		
		long ans = 1;
		for(int i : map.keySet()) {
			long temp = map.get(i) / N;
			if(temp >= 1) {
				ans = ans * (long)Math.pow(i, temp); 
			}
		}
		System.out.println(ans);
	}
}
