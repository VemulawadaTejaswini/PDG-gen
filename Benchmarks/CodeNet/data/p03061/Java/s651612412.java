
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] as = new int[N];
		int bigest = 0;
		for (int i = 0; i < N; i++) {
			if (sc.hasNext()) {
				as[i] = sc.nextInt();
				if (bigest < as[i]) {
					bigest = as[i];
				}
			}
		}
		Map<Integer, Integer> res = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int a = as[i];
			int suba = (int) Math.sqrt(a);
			for(int j=1; j <= suba;j++) {
				if(a % j == 0) {
					res.put(j, res.getOrDefault(j, 0)+1);
					res.put(a/j, res.getOrDefault(a/j, 0)+1);
				}
			}
		}
		
		int result = 1;
		for (Integer key : res.keySet()) {
			if (res.get(key) == N || res.get(key) == N-1) {
				if (key > result) {
					result = key;
				}
			}
		};
				
		System.out.println(result);
		
	}

}