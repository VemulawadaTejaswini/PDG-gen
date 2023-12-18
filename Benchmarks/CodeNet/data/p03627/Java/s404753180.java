import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if(map.containsKey(A)) {
				map.put(A, map.get(A) + 1);
			}else {
				map.put(A, 1);
			}
		}
		int first = -1;
		int second = -1;
		for(Map.Entry<Integer, Integer> mp : map.entrySet()) {
			if(mp.getValue() >= 4) {
				if(first == -1) {
					first = mp.getKey();
					second = mp.getKey();
					break;
				}
			}
			if(mp.getValue() >= 2) {
				if(first == -1) first = mp.getKey();
				else if(second == -1) {
					second = mp.getKey();
					break;
				}
			}
		}
		System.out.println((second == -1) ? 0 : first * second);
	}
}