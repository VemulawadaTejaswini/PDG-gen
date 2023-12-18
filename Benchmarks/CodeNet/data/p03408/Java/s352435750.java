import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			String word = s.next();
			Integer count = map.get(word);
			map.put(word, count == null ? 1 :count + 1);
		}
		
		int M = s.nextInt();
		for (int i = 0; i < M; i++) {
			String word = s.next();
			Integer count = map.get(word);
			map.put(word, count == null ? - 1 :count - 1);
		}
		int max = 0;
		for (String key : map.keySet()) {
			int i = map.get(key);
			if(i > max){
				max = i;
			}
		}
		System.out.println(max);
	}
}	
